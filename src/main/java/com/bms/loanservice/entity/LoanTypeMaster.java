package com.bms.loanservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LoanTypeMaster {

	public LoanTypeMaster() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int loanTypeId;


	@Column
	String loanType;

	public LoanTypeMaster(int loanId, String loanType) {
		super();
		this.loanTypeId = loanId;
		this.loanType = loanType;
	}


	public int getLoanId() {
		return loanTypeId;
	}


	public void setLoanId(int loanId) {
		this.loanTypeId = loanId;
	}


	public String getLoanType() {
		return loanType;
	}


	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	@Override
	public String toString() {
		return "LoanTypeMaster [loanTypeId=" + loanTypeId + ", loanType=" + loanType + "]";
	}



}