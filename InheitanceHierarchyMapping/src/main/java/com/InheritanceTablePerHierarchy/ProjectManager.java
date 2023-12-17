package com.InheritanceTablePerHierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ProjectManagerEmp")
public class ProjectManager extends Employee{
	
	@Column(name = "team_size")
	int teamSize;

	public ProjectManager()
	{
		
	}
	public ProjectManager(int empId ,String empName,int salary,int teamSize) {
		super(empId,empName,salary);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

}
