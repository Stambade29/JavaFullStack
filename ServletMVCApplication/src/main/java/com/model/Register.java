package com.model;

public class Register {
	private int regNo;
	private String custName;
	private int accNo;
	public Register(int regNo, String custName, int accNo) {
		super();
		this.regNo = regNo;
		this.custName = custName;
		this.accNo = accNo;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
}
