package com.CreditMagader.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SanctionLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sanctionId;
	private String sanctionDate;
	private String applicantName;
	private String contactDetails;
	private Double loanAmountSanction;
	private Double rateOfInterest;
	private Double loanTenure;
	private Integer monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsAndCondition;
	

}
