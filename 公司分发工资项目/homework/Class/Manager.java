package homework.Class;

import java.util.Date;

public class Manager extends Employee
{

	private int bouns;//奖金
	public static int count = 0; //经理计数
	/**
	 * @param name
	 * @param salary
	 * @param birthday
	 */
	public Manager(String name, int salary, String birthday, int bouns) 
	{
		super(name, salary, birthday);
		this.bouns = bouns;
		count++;
	}
	public Manager()
	{
		super();
	}
	
	
	public int getBouns() {
		return bouns;
	}
	
	public void setBouns(int bouns) {
		this.bouns = bouns;
	}
	
	/*
	 * （非 Javadoc）
	 * 经理发工资的函数
	 * 要重写
	 * @see homework.Class.Employee#attributeSalary()
	 */
	public void attributeSalary()
	{
		System.out.println("经理工资 ： " + (super.getSalary() + getBouns()) );
		attributeGift();
	}
	
	public void attributeGift()
	{
		System.out.println("经理礼物 :" + getGift());
	}
	
}
