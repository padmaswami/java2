package com.example.demo;

public class bankacc {

	private long accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	
	public bankacc() {
		super();
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public bankacc(long accountId, String accountHolderName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "bankacc [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + "]";
	}
	
}