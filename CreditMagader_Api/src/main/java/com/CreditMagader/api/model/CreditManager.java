package com.CreditMagader.api.model;

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
public class CreditManager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer creditManagerId;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionletter;
	

}
