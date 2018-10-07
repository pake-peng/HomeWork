package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player 
{
	private List<Integer> hitHistory; //炮击的记录
	private int achievement; //成绩
	
	public Player()
	{
		hitHistory = new ArrayList<Integer>();
		achievement = 0;
	}
	
	public boolean hit(WarShip warShip)
	{
		Scanner hit_in = new Scanner(System.in);
		System.out.println("输入你猜测的战舰的位置， 猜测的棋盘为" + WarShip.WARSHIP_SIZE_LENGTH + "X" + 
				WarShip.WARSHIP_SIZE_WIDTH + ",输入格式为 ： x,y  (0,0)开始");
		
		
		String s = hit_in.next();
		//记录炮击的历史记录
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
