package com.BranchManager.Api.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BranchManager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer branchManagerId;
	private Double loanAmount;
	private Boolean approve;
	private Boolean reject;
	private String remark;
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountdetails;
	

}
