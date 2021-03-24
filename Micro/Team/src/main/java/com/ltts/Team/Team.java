package com.ltts.Team;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Team 
{
	private int teamid;
	private String teamname;
	private String ownername;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public Team(int teamid, String teamname, String ownername) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.ownername = ownername;
	}
	public Team() {
		super();
	}
	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", ownername=" + ownername + "]";
	}
	
	
}
