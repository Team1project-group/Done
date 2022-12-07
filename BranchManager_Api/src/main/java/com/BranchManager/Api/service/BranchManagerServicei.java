package com.BranchManager.Api.service;

import java.util.Optional;

import com.BranchManager.Api.model.BranchManager;

public interface BranchManagerServicei {

	public Iterable<BranchManager> getBranchManager();

	public BranchManager saveBranchManager(BranchManager b);

	public Optional<BranchManager> getBranchManager(Integer id);
}
