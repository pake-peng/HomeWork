package com.game;

public class GameMain 
{
	private Player player;
	private WarShip warShip;
	
	public GameMain()
	{
		player = new Player();
		warShip = new WarShip("���ȵ�����ս��");
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
		System.out.println("******��ϲ����ʤ�� *****");
		System.out.println("******�����յĳɼ�Ϊ �� "+ computeAchievement() + "******");
	}
	
	public int computeAchievement()
	{
		float one_grade = 100 / (WarShip.WARSHIP_SIZE_LENGTH * WarShip.WARSHIP_SIZE_WIDTH 
				* warShip.getHitcnt()) ;
		player.setAchievement((float) (100.0 - one_grade * player.getHitHistory().size()));
		return (player.getAchievement());
	}
}
