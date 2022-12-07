package com.CreditMagader.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CreditMagader.api.model.CreditManager;
import com.CreditMagader.api.servicei.CreditManagerServicei;

@RestController

public class CreditManagerController {

	@Autowired
	CreditManagerServicei cs;

	@GetMapping("/getCreditmanager")
	public ResponseEntity<Iterable<CreditManager>> getAllData() {

		Iterable<CreditManager> creditmanager = cs.getAllData();

		return new ResponseEntity<Iterable<CreditManager>>(creditmanager, HttpStatus.OK);
	}

	@PostMapping("/postCreditmanager")
	public ResponseEntity<CreditManager> saveCreditMagager(@RequestBody CreditManager c) {
		CreditManager creditmanager = cs.saveCreditMagager(c);

		return new ResponseEntity<CreditManager>(creditmanager, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCreditmanager/{creditManagerId}")
	public ResponseEntity<CreditManager> deleteCreditManager(@PathVariable Integer creditManagerId) {
		cs.deleteCreditManager(creditManagerId);
		return new ResponseEntity<CreditManager>(HttpStatus.NO_CONTENT);

	}

}
