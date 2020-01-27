package com.royalgolf.response;

import com.royalgolf.beans.Status;

public class ResetPasswordResponse {
	private String transactionId;
	Status status;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
