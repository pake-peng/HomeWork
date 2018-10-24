package com.homework1;

public class Car extends Transport
{

	
	public Car() {
		super();
		
	}

	
	
	/**
	 * @param arriveTime
	 * @param backTime
	 * @param getTicketTime
	 * @param securityTime
	 * @param waitTime
	 * @param speed
	 * @param price
	 */
	public Car(String getTicketTime, String securityTime, String waitTime,
			double speed, double price) {
		super(getTicketTime, securityTime, waitTime, speed, price);
	}



	public void printTime()
	{
		System.out.println("乘坐汽车从" + super.getStartPlace() + "到" +  super.getArrivePlace()+
				"所需要的时间  " + super.CalculationTime() + "小时");
	}
	
}
