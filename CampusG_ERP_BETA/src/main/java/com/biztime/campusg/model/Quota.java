package com.biztime.campusg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quota {
	@Id
	private int quota_id;
	private String quota_name;
	public int getQuota_id() {
		return quota_id;
	}
	public void setQuota_id(int quota_id) {
		this.quota_id = quota_id;
	}
	public String getQuota_name() {
		return quota_name;
	}
	public void setQuota_name(String quota_name) {
		this.quota_name = quota_name;
	}
	
}
