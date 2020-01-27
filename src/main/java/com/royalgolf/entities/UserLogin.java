package com.royalgolf.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usermaster_1")
public class UserLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
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
	@Column(name = "DEPTCODE")
	private String deptcode;
	@Column(name = "USEMAIL")
	private String usemail;
	@Column(name = "USTEL")
	private String ustel;
	@Column(name = "ACTIVE")
	private int active;
	@Column(name = "ADDDATE")
	private Date addDate;
	@Column(name = "ADDUSER")
	private String addUser;
	@Column(name = "MODDATE")
	private Date modDate;
	@Column(name = "MODUSER")
	private String modUser;
	@Column(name = "USERSIGN")
	private String usersign;
	@Column(name = "RESSTATUS")
	private int resstatus;
	@Column(name = "PLGRPCODE")
	private String plgrpcode;
	@Column(name = "USTEL1")
	private String ustel1;
	@Column(name = "USTEL2")
	private String ustel2;
	@Column(name = "USERIMAGE")
	private String UserImage;
	@Column(name = "EMAILUSERNAME")
	private String emailusername;
	@Column(name = "EMAILPWD")
	private String emailpwd;
	

	public UserLogin() {
		super();
	}

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

	public String getUsemail() {
		return usemail;
	}

	public void setUsemail(String usemail) {
		this.usemail = usemail;
	}

	public String getUstel() {
		return ustel;
	}

	public void setUstel(String ustel) {
		this.ustel = ustel;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public String getAddUser() {
		return addUser;
	}

	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

	public Date getModDate() {
		return modDate;
	}

	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

	public String getModUser() {
		return modUser;
	}

	public void setModUser(String modUser) {
		this.modUser = modUser;
	}

	public String getUsersign() {
		return usersign;
	}

	public void setUsersign(String usersign) {
		this.usersign = usersign;
	}

	public int getResstatus() {
		return resstatus;
	}

	public void setResstatus(int resstatus) {
		this.resstatus = resstatus;
	}

	public String getPlgrpcode() {
		return plgrpcode;
	}

	public void setPlgrpcode(String plgrpcode) {
		this.plgrpcode = plgrpcode;
	}

	public String getUstel1() {
		return ustel1;
	}

	public void setUstel1(String ustel1) {
		this.ustel1 = ustel1;
	}

	public String getUstel2() {
		return ustel2;
	}

	public void setUstel2(String ustel2) {
		this.ustel2 = ustel2;
	}

	public String getUserImage() {
		return UserImage;
	}

	public void setUserImage(String userImage) {
		UserImage = userImage;
	}

	public String getEmailusername() {
		return emailusername;
	}

	public void setEmailusername(String emailusername) {
		this.emailusername = emailusername;
	}

	public String getEmailpwd() {
		return emailpwd;
	}

	public void setEmailpwd(String emailpwd) {
		this.emailpwd = emailpwd;
	}

	@Override
	public String toString() {
		return "UserLoginBean [userCode=" + userCode + ", userName=" + userName + ", userpwd=" + userpwd + ", groupid="
				+ groupid + ", userdesign=" + userdesign + ", deptcode=" + deptcode + ", usemail=" + usemail
				+ ", ustel=" + ustel + ", active=" + active + ", addDate=" + addDate + ", addUser=" + addUser
				+ ", modDate=" + modDate + ", modUser=" + modUser + ", usersign=" + usersign + ", resstatus="
				+ resstatus + ", plgrpcode=" + plgrpcode + ", ustel1=" + ustel1 + ", ustel2=" + ustel2 + ", UserImage="
				+ UserImage + ", emailusername=" + emailusername + ", emailpwd=" + emailpwd + "]";
	}
	

}
