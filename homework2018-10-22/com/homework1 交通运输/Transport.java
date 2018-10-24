package com.homework1;

public abstract class Transport 
{
	//时间都是以小时为单位
	private String arriveTime; 	//到目的地车站（机场）时间
	private String backTime;	//从车站（机场）返回起点的时间
	private String getTicketTime;	//取票时间
	private String securityTime;	//安检时间
	private String waitTime;	//候车时间
	private double speed;	//车速(km/h)
	private double price;	//（汽车0.32元/公里， 高铁二等座0.45/公里 ， 飞机0.75/公里）
	
	private String arrivePlace; //目的地
	private String startPlace;	//出发地
	private double distance;	//两地的距离
	public Transport()
	{
		
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
	public Transport(String getTicketTime, String securityTime, String waitTime,
			double speed, double price) 
	{
		this.getTicketTime = getTicketTime;
		this.securityTime = securityTime;
		this.waitTime = waitTime;
		this.speed = speed;
		this.price = price;
	}

	

	public String getArrivePlace() {
		return arrivePlace;
	}


	public void setArrivePlace(String arrivePlace) {
		this.arrivePlace = arrivePlace;
	}


	public String getStartPlace() {
		return startPlace;
	}


	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	public Double CalculationTime()
	{
		return Double.parseDouble(getTicketTime) + Double.parseDouble(securityTime)
				+Double.parseDouble(waitTime) + distance / speed ;
	}
	
	public double CalculationCost()
	{
		return distance * price;
	}
	
	public abstract void printTime();
	
}
