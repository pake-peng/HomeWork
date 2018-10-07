package com.game;

public class GameMain 
{
	private Player player;
	private WarShip warShip;
	
	public GameMain()
	{
		player = new Player();
		warShip = new WarShip("彭湃的银河战舰");
	}
	
	public void startGame()
	{
		warShip.creatPosition();
		while(warShip.getHitcnt() < 3)
		{
			if(!player.hit(warShip))
				System.out.println("you guess is wrong!");
			else
				System.out.println("you hit it!!" + "  but, you still have" + (WarShip.HITCNT_NUMBER -
						warShip.getHitcnt()) + " number have not destory");
		}
		System.out.println("******恭喜你获得胜利 *****");
		System.out.println("******你最终的成绩为 ： "+ computeAchievement() + "******");
	}
	
	public int computeAchievement()
	{
		float one_grade = 100 / (WarShip.WARSHIP_SIZE_LENGTH * WarShip.WARSHIP_SIZE_WIDTH 
				* warShip.getHitcnt()) ;
		player.setAchievement((float) (100.0 - one_grade * player.getHitHistory().size()));
		return (player.getAchievement());
	}
}
