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
		System.out.println("乘坐高铁从" + super.getStartPlace() + "到" +  super.getArrivePlace()+
				"所需要的时间  " + super.CalculationTime() + "小时");
	}

}
