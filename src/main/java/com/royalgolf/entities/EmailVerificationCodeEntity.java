package com.royalgolf.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmailVerificationCodeEntity implements Serializable {
	@Id
	private String transactionId;
	private String statusReg;
	private String uniquecode;
	private String codegenerationdate;
	private String status;
	private String errorcode;
	private String eroordesc;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatusReg() {
		return statusReg;
	}

	public void setStatusReg(String statusReg) {
		this.statusReg = statusReg;
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
