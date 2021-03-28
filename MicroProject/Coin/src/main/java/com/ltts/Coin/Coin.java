package com.ltts.Team;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Coin
{
	private int coinid;

	private String coinname;

	private String period;

	private int weight;

	private int price;

	private String description;

	public int getCoinid() {
		return coinid;
	}

	public void setCoinid(int coinid) {
		this.coinid = coinid;
	}

	public String getCoinname() {
		return coinname;
	}

	public void setCoinname(String coinname) {
		this.coinname = coinname;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Coin(int coinid, String coinname, String period, int weight, int price, String description) {
		super();
		this.coinid = coinid;
		this.coinname = coinname;
		this.period = period;
		this.weight = weight;
		this.price = price;
		this.description = description;
	}

	public Coin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coin [coinid=" + coinid + ", coinname=" + coinname + ", period=" + period + ", weight=" + weight
				+ ", price=" + price + ", description=" + description + "]";
	}
	
	
	
}
