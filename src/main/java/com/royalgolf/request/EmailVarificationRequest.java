package com.royalgolf.request;

import com.royalgolf.beans.Status;

public class EmailVarificationRequest {
	private String transactionid;
	private String uniquecode;
	private String codegenerationdate;
	private Status status;

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
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
