package com.CollectionMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@Column(name = "player_id")
	private int playerId;
	@Column(name = "player_name")
	private String playerName;
	@ManyToOne(targetEntity = Team.class)
	Team t1;
	
	
	public Player()
	{
		
	}
	public Player(int playerId, String playerName, Team t1) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.t1 = t1;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Team getT1() {
		return t1;
	}
	public void setT1(Team t1) {
		this.t1 = t1;
	}
	
		
	
}