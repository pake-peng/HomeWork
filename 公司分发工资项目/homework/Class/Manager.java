package homework.Class;

import java.util.Date;

public class Manager extends Employee
{

	private int bouns;//����
	public static int count = 0; //�������
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
	 * ���� Javadoc��
	 * �������ʵĺ���
	 * Ҫ��д
	 * @see homework.Class.Employee#attributeSalary()
	 */
	public void attributeSalary()
	{
		System.out.println("������ �� " + (super.getSalary() + getBouns()) );
		attributeGift();
	}
	
	public void attributeGift()
	{
		System.out.println("�������� :" + getGift());
	}
	
}
