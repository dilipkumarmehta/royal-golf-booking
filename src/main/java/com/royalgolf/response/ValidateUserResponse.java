package com.royalgolf.response;

import com.royalgolf.beans.Status;

public class ValidateUserResponse {

	private String transactionid;
	private boolean isuserexist;
	private Status status;

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public boolean isIsuserexist() {
		return isuserexist;
	}

	public void setIsuserexist(boolean isuserexist) {
		this.isuserexist = isuserexist;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
