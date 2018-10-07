package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player 
{
	private List<Integer> hitHistory; //�ڻ��ļ�¼
	private int achievement; //�ɼ�
	
	public Player()
	{
		hitHistory = new ArrayList<Integer>();
		achievement = 0;
	}
	
	public boolean hit(WarShip warShip)
	{
		Scanner hit_in = new Scanner(System.in);
		System.out.println("������²��ս����λ�ã� �²������Ϊ" + WarShip.WARSHIP_SIZE_LENGTH + "X" + 
				WarShip.WARSHIP_SIZE_WIDTH + ",�����ʽΪ �� x,y  (0,0)��ʼ");
		
		
		String s = hit_in.next();
		//��¼�ڻ�����ʷ��¼
		hitHistory.add(Integer.parseInt(String.valueOf(s.charAt(0)) ) 
				* WarShip.WARSHIP_SIZE_WIDTH + 
				 Integer.parseInt(String.valueOf(s.charAt(2))) );
		return (warShip.hitFlag(s));
	}
	
	public List<Integer> getHitHistory()
	{
		return hitHistory;
	}
	public int getAchievement()
	{
		return achievement;
	}
	
	public void setAchievement(float Fachievement)
	{
		achievement = (int)Fachievement;
	}
	
}
