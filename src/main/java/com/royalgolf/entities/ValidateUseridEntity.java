package com.royalgolf.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ValidateUseridEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TRANSACTIONID", nullable = false)
	private String transactionId;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "ISUSEREXIST")
	private boolean isuserexist;
	@Column(name = "ERRORCODE")
	private String errorcode;
	@Column(name = "EROORDESC")
	private String eroordesc;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public boolean isIsuserexist() {
		return isuserexist;
	}

	public void setIsuserexist(boolean isuserexist) {
		this.isuserexist = isuserexist;
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
