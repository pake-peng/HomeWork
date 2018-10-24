package com.homework1;

import java.util.Scanner;

public class ControlTranSport 
{
	public static void main(String[] args)
	{
		Transport s[] = new Transport[3];
		/*String getTicketTime, String securityTime, String waitTime,
		double speed, double price*/
		s[0] = new Car("0.5", "0.1", "1" , 60.0, 0.32);
		s[1] = new HightSpeedRail("0.5", "0.1", "1" , 180.0, 0.45);
		s[2] = new aircraft("0.5", "0.1", "1" , 300.0, 0.75);
		for(Transport t : s)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("请依次输入" + t.getClass() + " 出发地 、目的地、距离");
			t.setStartPlace(in.next());
			t.setArrivePlace(in.next());
			try
			{
				t.setDistance(in.nextDouble());
			}
			catch(Exception e)
			{
				System.out.println("距离是double ，请输入浮点数");
				t.setDistance(in.nextDouble());
			}
			t.printTime();
		}
	}

}
