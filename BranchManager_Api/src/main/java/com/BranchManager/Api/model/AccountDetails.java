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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;
	private Boolean status;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankdetails;
	

}
