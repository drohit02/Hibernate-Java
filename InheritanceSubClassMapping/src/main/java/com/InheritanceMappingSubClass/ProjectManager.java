package com.InheritanceMappingSubClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "proj_manager_subclass" )
public class ProjectManager extends Employee{
	
	@Column(name = "team_size")
	private int teamSize;
	
	public ProjectManager() {
	
	}

	public ProjectManager(int id,String name,int salary,int teamSize) {
		super(id,name,salary);
		this.teamSize = teamSize;
	}
	
	
	
	

}
