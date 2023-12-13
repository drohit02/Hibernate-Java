package com.AccountProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")

public class Account {
	
	@Id
	@Column(name = "acc_id")
	private int accId;
	@Column(name = "acc_name")
	private String accName;
	@Column(name = "balance")
	private float balance;
	
	public Account()
	{
		
	}
	public Account(int accId, String accName, float balance) {
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
