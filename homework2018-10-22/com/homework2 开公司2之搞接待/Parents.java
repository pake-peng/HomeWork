package com.homework2;

public class Parents extends People implements IFLiving
{
	public Parents()
	{
		super(200, 200, 100);
	}
	
	public void eat() {
		System.out.println(Parents.class.getSimpleName() + "每天吃的消费是 " + super.getCost_eat() + " 吃一共消费  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(Parents.class.getSimpleName() + "每天住的消费是 " + super.getCost_live() + " 住一共消费  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(Parents.class.getSimpleName() + " 每天出行的消费是 " + super.getCost_walk() + " 出行一共消费  "
				+ super.getCost_walk() * super.getReserveDuring());
		
	}
}
