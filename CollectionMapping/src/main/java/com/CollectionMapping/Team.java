package com.CollectionMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name = "team")
public class Team {

	@Id
	@Column(name = "team_id")
	private int teamId;
	@Column(name = "team_name")
	private String teamName;
	@OneToMany(targetEntity = Player.class,cascade = CascadeType.ALL)
	List<Player> myPlayerList ;
	
	
	public Team() {

	}
	
	public Team(int teamId, String teamName, List<Player> myPlayerList) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.myPlayerList = myPlayerList;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<Player> getMyPlayerList() {
		return myPlayerList;
	}
	public void setMyPlayerList(List<Player> myPlayerList) {
		this.myPlayerList = myPlayerList;
	}
	
	
}
