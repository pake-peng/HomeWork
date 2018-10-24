package com.homework2;

public class ForeignGuests extends People implements IFLiving, IFGift
{
	public String gift;
	public ForeignGuests()
	{
		super(500, 400, 200);
		gift = "金苹果";
	}
	public ForeignGuests(String gift)
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
		System.out.println(" 外宾的礼物是 " + gift);
		
	}

	@Override
	public void eat() {
		System.out.println(ForeignGuests.class.getSimpleName() + "每天吃的消费是 " + super.getCost_eat() + " 吃一共消费  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(ForeignGuests.class.getSimpleName() + "每天住的消费是 " + super.getCost_live() + " 住一共消费  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(ForeignGuests.class.getSimpleName() + " 每天出行的消费是 " + super.getCost_walk() + " 出行一共消费  "
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

