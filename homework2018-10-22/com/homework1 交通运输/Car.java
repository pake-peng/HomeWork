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
		System.out.println("����������" + super.getStartPlace() + "��" +  super.getArrivePlace()+
				"����Ҫ��ʱ��  " + super.CalculationTime() + "Сʱ");
	}
	
}
