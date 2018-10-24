package com.homework2;

public class Student extends People implements IFLiving
{
	
	public Student()
	{
		super(150, 150, 100);
	}
	
	@Override
	public void eat() {
		System.out.println(Student.class.getSimpleName() + "每天吃的消费是 " + super.getCost_eat() + " 吃一共消费  "
				+ super.getCost_eat() * super.getReserveDuring());
		
	}

	@Override
	public void live() {
		System.out.println(Student.class.getSimpleName() + "每天住的消费是 " + super.getCost_live() + " 住一共消费  "
				+ super.getCost_live() * super.getReserveDuring());
		
	}

	@Override
	public void walk() {
		System.out.println(Student.class.getSimpleName() + " 每天出行的消费是 " + super.getCost_walk() + " 出行一共消费  "
				+ super.getCost_walk() * super.getReserveDuring());
		
	}
	
}
