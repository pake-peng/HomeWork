package com.homework1;

public abstract class Transport 
{
	//ʱ�䶼����СʱΪ��λ
	private String arriveTime; 	//��Ŀ�ĵس�վ��������ʱ��
	private String backTime;	//�ӳ�վ����������������ʱ��
	private String getTicketTime;	//ȡƱʱ��
	private String securityTime;	//����ʱ��
	private String waitTime;	//��ʱ��
	private double speed;	//����(km/h)
	private double price;	//������0.32Ԫ/��� ����������0.45/���� �� �ɻ�0.75/���
	
	private String arrivePlace; //Ŀ�ĵ�
	private String startPlace;	//������
	private double distance;	//���صľ���
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
