package com.ltts.Team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Teamdao 
{
	public List<Team> getTeam(){
		List<Team> listofTeams=new ArrayList<>();
		listofTeams.add(new Team(123,"iphone","gyu")) ;
		listofTeams.add(new Team(124,"iphone_x","hui")) ;
		listofTeams.add(new Team(125,"iphone_XI","jio")) ;
		return listofTeams;
	}

}
