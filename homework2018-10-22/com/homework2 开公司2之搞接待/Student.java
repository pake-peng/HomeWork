package com.homework2;

public class Student extends People implements IFLiving
{
	
	public Student()
	{
		super(150, 150, 100);
	}
	
	@Override
	public void eat() {
		System.out.println(Student.class.getSimpleName() + "ÿ��Ե������� " + super.getCost_eat() + " ��һ������  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(Student.class.getSimpleName() + "ÿ��ס�������� " + super.getCost_live() + " סһ������  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(Student.class.getSimpleName() + " ÿ����е������� " + super.getCost_walk() + " ����һ������  "
				+ super.getCost_walk() * super.getReserveDuring());
		
	}
	
}
