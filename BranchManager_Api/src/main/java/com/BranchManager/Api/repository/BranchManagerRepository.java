package com.BranchManager.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BranchManager.Api.model.BranchManager;
@Repository
public interface BranchManagerRepository extends JpaRepository<BranchManager, Integer>{

}
