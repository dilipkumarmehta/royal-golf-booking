package com.royalgolf.response;

import com.royalgolf.beans.Status;

public class UserRegistrationResponse {
	private String transactionId;
	private String statusReg;
	private String uniquecode;
	private String codegenerationdate;
	private Status status;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatusReg() {
		return statusReg;
	}

	public void setStatusReg(String statusReg) {
		this.statusReg = statusReg;
	}

	public String getUniquecode() {
		return uniquecode;
	}

	public void setUniquecode(String uniquecode) {
		this.uniquecode = uniquecode;
	}

	public String getCodegenerationdate() {
		return codegenerationdate;
	}

	public void setCodegenerationdate(String codegenerationdate) {
		this.codegenerationdate = codegenerationdate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
