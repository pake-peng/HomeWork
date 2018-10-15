package homework.Class;

import java.util.Date;

import homework.Interface.SalaryFunction;



public class Employee implements SalaryFunction
{
	private String name; //职员姓名
	private int salary;//职员工资
	private String birthday;//职员生日
	private String gift;//职员收到的礼物
	
	public static int count = 0; //雇员计数
	
	/**
	 * @param name
	 * @param salary
	 * @param birthday
	 */
	public Employee(String name, int salary, String birthday) {
		this.name = name;
		this.salary = salary;
		this.birthday = birthday;
		count++;
	}
	public Employee()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	/*
	 * （非 Javadoc）
	 * 雇员发工资的函数
	 * @see homework.Interface.SalaryFunction#attributeSalary()
	 */
	public void attributeSalary()
	{
		System.out.println("员工工资 ： " + salary);
		attributeGift();
	}
	
	
	
	public String getGift() {
		return gift;
	}

	
	public void setGift(String gift) {
		this.gift = gift;
	}

	public void attributeGift()
	{
		System.out.println("员工礼物 :" + getGift());
	}
	

}
