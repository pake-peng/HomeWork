package com.homework1;

public class HightSpeedRail extends Transport 
{
	
	public HightSpeedRail() {
		super();
	}

	
	public HightSpeedRail(String getTicketTime, String securityTime,
			String waitTime, double speed, double price) {
		super(getTicketTime, securityTime, waitTime, speed, price);

	}

	public void printTime() 
	{
		System.out.println("����������" + super.getStartPlace() + "��" +  super.getArrivePlace()+
				"����Ҫ��ʱ��  " + super.CalculationTime() + "Сʱ");
	}

}
