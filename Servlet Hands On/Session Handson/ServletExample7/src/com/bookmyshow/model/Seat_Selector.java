package com.bookmyshow.model;

public class Seat_Selector {

	private int id;
	private String type;
	double cost;
	private int num;
	
	public Seat_Selector() {
	}

	public Seat_Selector(int id, String type, double cost, int num) {
		super();
		this.id = id;
		this.type = type;
		this.cost = cost;
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Seat_Selector [id=" + id + ", type=" + type + ", cost=" + cost + ", num=" + num + "]";
	}
	
	
}
