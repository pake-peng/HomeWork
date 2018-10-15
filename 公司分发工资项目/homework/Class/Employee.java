package homework.Class;

import java.util.Date;

import homework.Interface.SalaryFunction;



public class Employee implements SalaryFunction
{
	private String name; //ְԱ����
	private int salary;//ְԱ����
	private String birthday;//ְԱ����
	private String gift;//ְԱ�յ�������
	
	public static int count = 0; //��Ա����
	
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
	 * ���� Javadoc��
	 * ��Ա�����ʵĺ���
	 * @see homework.Interface.SalaryFunction#attributeSalary()
	 */
	public void attributeSalary()
	{
		System.out.println("Ա������ �� " + salary);
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
		System.out.println("Ա������ :" + getGift());
	}
	

}
