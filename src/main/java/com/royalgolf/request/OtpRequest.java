package com.royalgolf.request;

public class OtpRequest {
	private String transactionId;
	private String transactiontTyp;
	private String userId;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactiontTyp() {
		return transactiontTyp;
	}

	public void setTransactiontTyp(String transactiontTyp) {
		this.transactiontTyp = transactiontTyp;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
