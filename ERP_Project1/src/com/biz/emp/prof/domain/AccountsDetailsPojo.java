package com.biz.emp.prof.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_accounts")
public class AccountsDetailsPojo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "emp_ID")
	 String emp_ID;
	
	@Column(name = "bankname")
	 String bankname;
	
	@Column(name = "accountnumber")
	 String accountnumber;
	
	@Column(name = "ifsccode")
	 String ifsccode;
	
	@Column(name = "accounttype")
	 String accounttype;
	
	@Column(name = "branchname")
	 String branchname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(String emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	
	
	
	
	
}
