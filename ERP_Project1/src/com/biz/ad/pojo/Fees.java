package com.biz.ad.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fee")
public class Fees {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Fee_ID")
	private int fee_id;
	
	@Column(name="Fee_Name")
	private String fee_name;
	
	@Column(name="Fee_Description")
	private String fee_description;

	public int getFee_id() {
		return fee_id;
	}

	public void setFee_id(int fee_id) {
		this.fee_id = fee_id;
	}

	public String getFee_name() {
		return fee_name;
	}

	public void setFee_name(String fee_name) {
		this.fee_name = fee_name;
	}

	public String getFee_description() {
		return fee_description;
	}

	public void setFee_description(String fee_description) {
		this.fee_description = fee_description;
	}
	
	

}
