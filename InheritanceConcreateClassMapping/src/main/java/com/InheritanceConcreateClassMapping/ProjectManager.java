package com.InheritanceConcreateClassMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "proj_manager_employee")
@DiscriminatorValue(value = "proj_manager_emp")
public class ProjectManager extends Employee {

	@Column(name = "team_size")
	private int teamSize;

	public ProjectManager() {
		
	}
	public ProjectManager(int id,String name,int salary,int teamSize) {
		super(id,name,salary);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
}
