package com.royalgolf.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	// @Id
	@Column(name = "USERCODE", nullable = false)
	private String userCode;
	@Column(name = "USERNAME")
	
	private String userName;
	@Column(name = "USERPWD")
	private String userpwd;
	@Column(name = "GROUPID")
	private int groupid;
	@Column(name = "USERDESIGN")

	private String userdesign;
	@Id
	@Column(name = "DEPTCODE")
	private String deptcode;

	@Column(name = "USEMAIL")
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public String getUserdesign() {
		return userdesign;
	}

	public void setUserdesign(String userdesign) {
		this.userdesign = userdesign;
	}

	public String getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Test [userCode=" + userCode + ", userName=" + userName + ", userpwd=" + userpwd + ", groupid=" + groupid
				+ ", userdesign=" + userdesign + ", deptcode=" + deptcode + "]";
	}

}
