package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.BranchDto;
import com.crts.app.hm.main.service.IbranchService;

@RestController
public class BranchController {
	@Autowired
	IbranchService ser;

	@RequestMapping(value = "/regBranch", method = RequestMethod.POST, produces = "application/json")
	public String saveBranch(@RequestBody BranchDto b) {
		ser.saveBranch(b);
		return "Data saved successfully";
	}

	@RequestMapping(value = "/getAllBranches", method = RequestMethod.GET, consumes = "application/json")
	public List<BranchDto> getAllBranches() {
		List<BranchDto> list = ser.getAllBranches();

		return list;
	}

	@RequestMapping("/getBranchById/{branchId}")
	public BranchDto getBranchById(@PathVariable int branchId) {
		BranchDto branchdto = ser.getBranchById(branchId);
		return branchdto;
	}

	@RequestMapping(value = "/getBranchByName/{branchName}")
	public BranchDto getBranchByName(@PathVariable String branchName) {
		BranchDto branchdto = (BranchDto) ser.getBranchByName(branchName);
		return branchdto;
	}

	@RequestMapping(value = "/deleteAllState", method = RequestMethod.GET)
	public List<BranchDto> deleteAllBranch() {
		ser.deleteAllBranch();
		List<BranchDto> list = ser.getAllBranches();
		return list;
	}

	@RequestMapping(value = "/deleteBranchById/{branchId}")
	public List<BranchDto> deleteBranchById(@PathVariable int branchId) {
		ser.deleteBranchById(branchId);
		List<BranchDto> list = ser.getAllBranches();
		return list;
	}

	@RequestMapping(value = "/editBranchById/{branchId}")
	public BranchDto editBranchById(@PathVariable int branchId) {
		BranchDto branchdto = ser.editBranchById(branchId);
		return branchdto;
	}

	@RequestMapping(value = "updateBranchById")
	public List<BranchDto> updateBranchById(@RequestBody BranchDto branchdto) {
		ser.saveBranch(branchdto);
		List<BranchDto> list = ser.getAllBranches();

		return list;
	}
}
