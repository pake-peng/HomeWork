package com.homework2;

public class Parents extends People implements IFLiving
{
	public Parents()
	{
		super(200, 200, 100);
	}
	
	public void eat() {
		System.out.println(Parents.class.getSimpleName() + "ÿ��Ե������� " + super.getCost_eat() + " ��һ������  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(Parents.class.getSimpleName() + "ÿ��ס�������� " + super.getCost_live() + " סһ������  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(Parents.class.getSimpleName() + " ÿ����е������� " + super.getCost_walk() + " ����һ������  "
				+ super.getCost_walk() * super.getReserveDuring());
		
	}
}
