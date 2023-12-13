package com.EmpAddressContainment;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name = "lane_name")
	private String lane;
	@Column(name = "colony_name")
	private String colony;
	
	public Address() {
		this.lane = "Not Given";
		this.colony = "not Given";
	}
	
	public Address(String lane, String colony) {
		super();
		this.lane = lane;
		this.colony = colony;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	@Override
	public String toString() {
		return "Address [lane=" + lane + ", colony=" + colony + "]";
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}
	
	
	
	

}
