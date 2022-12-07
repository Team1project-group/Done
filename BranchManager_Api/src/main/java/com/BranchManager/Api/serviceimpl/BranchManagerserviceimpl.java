package com.BranchManager.Api.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BranchManager.Api.model.BranchManager;
import com.BranchManager.Api.repository.BranchManagerRepository;
import com.BranchManager.Api.service.BranchManagerServicei;

@Service
public class BranchManagerserviceimpl implements BranchManagerServicei{
	
	@Autowired
	BranchManagerRepository br;

	@Override
	public Iterable<BranchManager> getBranchManager() {
		Iterable<BranchManager> allData = br.findAll();
		
		return allData;
	}

	@Override
	public BranchManager saveBranchManager(BranchManager b) {

		return br.save(b);
	}

	@Override
	public Optional<BranchManager> getBranchManager(Integer id) {
		br.findById(id);
		return br.findById(id);
	}

}
