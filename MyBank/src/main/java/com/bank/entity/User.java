package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AccountNo;
	
	private String userName;
	private long phoneNo;
	private String email;
	private long aadharNo;
	private String panNo;
	@Column(length = 500)
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int accountNo, String userName, long phoneNo, String email, long aadharNo, String panNo,
			String address) {
		super();
		AccountNo = accountNo;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.address = address;
	}
	
	public int getAccountNo() {
		return AccountNo;
	}
	
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getAadharNo() {
		return aadharNo;
	}
	
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	public String getPanNo() {
		return panNo;
	}
	
	
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	

}
