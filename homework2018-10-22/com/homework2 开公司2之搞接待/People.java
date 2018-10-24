package com.homework2;

public abstract class People implements IFLiving
{

	private int cost_eat; //一天的吃的消费
	private int cost_live; //一条的住的消费
	private int cost_walk; //一天的出行的消费
	
	private int reserveDuring; //接待的天数
	private String StartPlace; //出发地点
	private String arrivePlace; // 到达地点
	
	public People(int cost_eat, int cost_live, int cost_walk) 
	{
		this.cost_eat = cost_eat;
		this.cost_live = cost_live;
		this.cost_walk = cost_walk;
	}

	public int getCost_walk() {
		return cost_walk;
	}

	public void setCost_walk(int cost_walk) {
		this.cost_walk = cost_walk;
	}

	public int getReserveDuring() {
		return reserveDuring;
	}

	public void setReserveDuring(int reserveDuring) {
		this.reserveDuring = reserveDuring;
	}

	public String getStartPlace() {
		return StartPlace;
	}

	public void setStartPlace(String startPlace) {
		StartPlace = startPlace;
	}

	public int getCost_eat() {
		return cost_eat;
	}

	public void setCost_eat(int cost_eat) {
		this.cost_eat = cost_eat;
	}

	public int getCost_live() {
		return cost_live;
	}

	public void setCost_live(int cost_live) {
		this.cost_live = cost_live;
	}

	public String getArrivePlace() {
		return arrivePlace;
	}

	public void setArrivePlace(String arrivePlace) {
		this.arrivePlace = arrivePlace;
	}

	public void printCost()
	{
		eat();
		live();
		walk();
	}
	public void information()
	{
		
	}
	
	

}
