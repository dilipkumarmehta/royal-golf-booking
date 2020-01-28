package com.royalgolf.response;

public class EmailVarificationResponse {
	private String transactionid;
	private String emailverifiedstatus;
	private String status;
	private String errorcode;
	private String eroordesc;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getEroordesc() {
		return eroordesc;
	}

	public void setEroordesc(String eroordesc) {
		this.eroordesc = eroordesc;
	}

}
