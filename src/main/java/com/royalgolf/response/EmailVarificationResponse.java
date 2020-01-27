package com.royalgolf.response;

import com.royalgolf.beans.Status;

public class EmailVarificationResponse {

	private String transactionid;
	private String emailverifiedstatus;
	private Status status;

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public String getEmailverifiedstatus() {
		return emailverifiedstatus;
	}

	public void setEmailverifiedstatus(String emailverifiedstatus) {
		this.emailverifiedstatus = emailverifiedstatus;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
