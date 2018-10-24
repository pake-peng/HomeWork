package com.homework2;

public class Boss extends People implements IFLiving, IFGift
{
	public String gift;
	public Boss()
	{
		super(400, 300, 200);
		gift = "��ƻ��";
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
		System.out.println(" �ϰ�������� " + gift);
		
	}

	@Override
	public void eat() {
		System.out.println(Boss.class.getSimpleName() + "ÿ��Ե������� " + super.getCost_eat() + " ��һ������  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(Boss.class.getSimpleName() + "ÿ��ס�������� " + super.getCost_live() + " סһ������  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(Boss.class.getSimpleName() + " ÿ����е������� " + super.getCost_walk() + " ����һ������  "
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
