package com.homework1;

public class aircraft extends Transport {

	public aircraft() {
		
	}

	public aircraft(String getTicketTime, String securityTime, String waitTime,
			double speed, double price) {
		super(getTicketTime, securityTime, waitTime, speed, price);
	}

	
	public void printTime() 
	{
		System.out.println("�����ɻ���" + super.getStartPlace() + "��" +  super.getArrivePlace()+
				"����Ҫ��ʱ��  " + super.CalculationTime() + "Сʱ");
	}

}
