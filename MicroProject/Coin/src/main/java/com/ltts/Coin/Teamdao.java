package com.ltts.Team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Teamdao 
{
	public List<Coin> getCoin(){
		List<Coin> listofCoins=new ArrayList<>();
		listofCoins.add(new Coin(123,"Golden","gyu",50,1000,"Gold")) ;
		listofCoins.add(new Coin(123,"Silver","oiju",20,500,"Sil")) ;
		listofCoins.add(new Coin(123,"Bronze","gyg",10,60000,"Bronze")) ;
		return listofCoins;
	}

}
