package com.InheritanceConcreateClassMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name = "dev_employee")
public class Developer extends Employee{
	
	@Column(name = "skill_set")
	private String skillSet  ;
	
	public Developer() {
		
	}

	public Developer(int id,String name,int salary,String skillSet) {
		super(id,name,salary);
		this.skillSet = skillSet;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
	

}
