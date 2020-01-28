package com.royalgolf.response;

import com.royalgolf.beans.Status;

public class EmailVarificationCodeResponse {

	private String transactionId;
	private String uniqueCode;
	private String codeGenerationDate;
	private String status;
	private String errorcode;
	private String eroordesc;

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
