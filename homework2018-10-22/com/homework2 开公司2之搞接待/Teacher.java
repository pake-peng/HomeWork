package com.homework2;

public class Teacher extends People implements IFLiving
{
	public Teacher()
	{
		super(250, 250, 150);
	}
	
	public void eat() {
		System.out.println(Teacher.class.getSimpleName() + "ÿ��Ե������� " + super.getCost_eat() + " ��һ������  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(Teacher.class.getSimpleName() + "ÿ��ס�������� " + super.getCost_live() + " סһ������  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(Teacher.class.getSimpleName() + " ÿ����е������� " + super.getCost_walk() + " ����һ������  "
				+ super.getCost_walk() * super.getReserveDuring());
		
	}
	
	
}
