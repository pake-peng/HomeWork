package com.game;
//import java.util.Random;
/*
 * 
 */
public class WarShip 
{
	public static final int WARSHIP_SIZE_LENGTH = 5;
	public static final int WARSHIP_SIZE_WIDTH = 5;
	public static final int HITCNT_NUMBER = 3;
	
	private String warName;  //ս������
	private boolean[] position; //ս��λ��
	private String[] hitPosition; //���е�λ��
	private boolean status; //��ǰ״̬
	private int hitcnt; //���д���
	public WarShip(String aWarName)
	{
		warName = aWarName;
		position = new boolean[WARSHIP_SIZE_LENGTH * WARSHIP_SIZE_WIDTH]; // ��ʼ��5X5����
		status = false;
		hitcnt = 0;
	}
	
	
	//�ж��Ƿ����ս��
	public boolean hitFlag(String guessPos)
	{
		int WarPosition = Integer.parseInt(String.valueOf(guessPos.charAt(0)) ) * WARSHIP_SIZE_WIDTH + 
				Integer.parseInt(String.valueOf(guessPos.charAt(2)) );
		
		 if(position[WarPosition] == true)
		 {
			 ++hitcnt;
			 position[WarPosition] = false;
			 return true;
		 }
		 return false;
		
	}
	
	public void creatPosition()
	{
		int[] InitWSPositon = new int[3]; // ��ȡ����ս����λ��
		
		
		//�������ξ�������������ս��λ�ø����ֵ������Ҫ�������3����������ظ�����������Ҫ�޳��������ü��ϣ��������߼�ѭ�����
		int testWS=0; //������¼�Ѿ���ֵ����Ч������ĸ���
		int recordRandom; //������¼�����������ֵ
		while(testWS < HITCNT_NUMBER)
		{
			recordRandom = (int)( Math.random() * WarShip.WARSHIP_SIZE_LENGTH 
					* WarShip.WARSHIP_SIZE_WIDTH ); // 0 - 25
			InitWSPositon[testWS] = recordRandom;
			for(int i=0; i<testWS; i++)
			{
				if(InitWSPositon[i] == recordRandom )
				{
					recordRandom = (int)Math.random()*25 + 1;
					--i;
				}
			}
			++testWS;
		}
		
		//��ս��λ�ø�trueֵ
		for(int i : InitWSPositon)
			position[i] = true;
	}
	
	public int getHitcnt()
	{
		return hitcnt;
	}
	
	
	
	
	
}
