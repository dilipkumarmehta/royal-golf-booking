package com.royalgolf.request;

import com.royalgolf.beans.Status;

public class GetProfileRequest {
	private String transactioniId;
	private Status status;

	public String getTransactioniId() {
		return transactioniId;
	}

	public void setTransactioniId(String transactioniId) {
		this.transactioniId = transactioniId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
