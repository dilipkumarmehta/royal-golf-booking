package com.royalgolf.response;

import com.royalgolf.beans.Status;

public class EmailVarificationCodeResponse {

	private String transactionId;
	private String uniqueCode;
	private String codeGenerationDate;
	private Status status;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public String getCodeGenerationDate() {
		return codeGenerationDate;
	}

	public void setCodeGenerationDate(String codeGenerationDate) {
		this.codeGenerationDate = codeGenerationDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
