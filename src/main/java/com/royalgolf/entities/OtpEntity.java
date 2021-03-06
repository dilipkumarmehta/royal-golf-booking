package com.royalgolf.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OtpEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String transactionId;
	private String otp;
	private String status;
	private String errorcode;
	private String eroordesc;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
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
