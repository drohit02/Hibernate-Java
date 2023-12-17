package com.InheritanceTablePerHierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "DeveloperEmp")
public class Develpoer extends Employee{
	
	@Column(name = "skill_set")
	private String skillset;

	public Develpoer()
	{
		
	}
	public Develpoer(int empId ,String empName,int salary,String skillset) {
		super(empId,empName,salary);
		this.skillset = skillset;
	}
	
	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

}
