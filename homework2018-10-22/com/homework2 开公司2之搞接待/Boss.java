package com.homework2;

public class Boss extends People implements IFLiving, IFGift
{
	public String gift;
	public Boss()
	{
		super(400, 300, 200);
		gift = "银苹果";
	}
	public Boss(String gift)
	{
		super(400, 300, 200);
		this.gift = gift;
	}

	
	public String getGift() 
	{
		return gift;
	}


	public void setGift(String gift) 
	{
		this.gift = gift;
	}


	@Override
	public void gif() 
	{
		System.out.println(" 老板的礼物是 " + gift);
		
	}

	@Override
	public void eat() {
		System.out.println(Boss.class.getSimpleName() + "每天吃的消费是 " + super.getCost_eat() + " 吃一共消费  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(Boss.class.getSimpleName() + "每天住的消费是 " + super.getCost_live() + " 住一共消费  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(Boss.class.getSimpleName() + " 每天出行的消费是 " + super.getCost_walk() + " 出行一共消费  "
				+ super.getCost_walk() * super.getReserveDuring());
		
	}
	
	public void printCost()
	{
		eat();
		live();
		walk();
		gif();
	}
	
	
}
