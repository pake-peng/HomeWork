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
	
	private String warName;  //战舰名称
	private boolean[] position; //战舰位置
	private String[] hitPosition; //击中的位置
	private boolean status; //当前状态
	private int hitcnt; //击中次数
	public WarShip(String aWarName)
	{
		warName = aWarName;
		position = new boolean[WARSHIP_SIZE_LENGTH * WARSHIP_SIZE_WIDTH]; // 初始化5X5棋盘
		status = false;
		hitcnt = 0;
	}
	
	
	//判断是否击中战舰
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
		int[] InitWSPositon = new int[3]; // 获取三个战舰的位置
		
		
		//这个代码段就是用来给三个战舰位置赋随机值，但是要避免随机3个代码出现重复操作，所以要剔除，不会用集合，所以用逻辑循环检查
		int testWS=0; //用来记录已经赋值的有效随机数的个数
		int recordRandom; //用来记录生成随机数的值
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
		
		//给战舰位置赋true值
		for(int i : InitWSPositon)
			position[i] = true;
	}
	
	public int getHitcnt()
	{
		return hitcnt;
	}
	
	
	
	
	
}
