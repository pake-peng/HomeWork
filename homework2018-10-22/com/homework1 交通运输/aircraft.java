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
		System.out.println("乘坐飞机从" + super.getStartPlace() + "到" +  super.getArrivePlace()+
				"所需要的时间  " + super.CalculationTime() + "小时");
	}

}
