package com.BranchManager.Api.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BranchManager.Api.model.BranchManager;
import com.BranchManager.Api.service.BranchManagerServicei;

@RestController
public class BranchManagerController {
	
	@Autowired
	BranchManagerServicei bs;
	
	@GetMapping("/getBranchManager")
	public ResponseEntity<Iterable<BranchManager>> getAllBranchManager()
	{
		 Iterable<BranchManager> branchmanager= bs.getBranchManager();
		 
		 
		 
		 return new ResponseEntity<Iterable<BranchManager>>(branchmanager,HttpStatus.OK);
	}
	
	@PostMapping("/postBranchManager")
	public ResponseEntity<BranchManager> saveBranchManager(@RequestBody BranchManager b)
	{
		BranchManager branchmanager=bs.saveBranchManager(b);
		
		return new ResponseEntity<BranchManager>(branchmanager,HttpStatus.CREATED);
	}
	@GetMapping("/getBranchManager/{id}")
	public ResponseEntity<BranchManager> getAllBranchManager(@PathVariable Integer id)
	{
		Optional<BranchManager> branchmanager= bs.getBranchManager(id);
		if(branchmanager.isPresent())
		{
			BranchManager branchManager2 = branchmanager.get();
			System.out.println( branchManager2.getAccountdetails().getBankdetails().getDate());
			Date date = branchManager2.getAccountdetails().getBankdetails().getDate();
			
			Date d=new Date();
			System.out.println(d.getMonth());
			
			if(d.getMinutes()>5)
			{
				System.out.println("late");
			}
			
			
			return new ResponseEntity<BranchManager>(branchManager2,HttpStatus.OK);
		}
		  return new ResponseEntity<BranchManager>(HttpStatus.NO_CONTENT);
	}
	

}
