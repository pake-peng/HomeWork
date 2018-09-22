
/**
 * 
 * @author 彭湃
 * @version java 10
 * 
 * 属性：
 * 		用户得分，随机数
 * 方法:
 * 		界面
 * 		随机数的重置
 * 		得分累计
 *		随机数的检测
 */
import java.lang.*;
import java.util.Scanner;

public class GameBase 
{
	private int score;
	private int randomNumber;
	private int diffcult;
	
	public GameBase()
	{
		score = 8;
		randomNumber = -1;
		diffcult = 1;
	}
	
	//设置随机数函数
	public void setRandomNumber()
	{
		randomNumber = (int)(Math.random() * (diffcult * 10)) + 1;
	}
	
	
	public int getRandomNumber()
	{
		return randomNumber;
	}
	
	//菜单打印
	public void printMenu()
	{
		System.out.println("********* Wellcom to paly Guess Game ********* ");
		System.out.println("********* 1 :    crate new game 	 *********");
		System.out.println("********* 2 :    game help 		 *********");
		System.out.println("********* 3 :    set diffcult        *********");
		Scanner in  = new Scanner(System.in);
		
		int m = in.nextInt();
		
		
		//检测2，3情况,弹出菜单情况，2，3后递归调用一次该函数用来打印菜单，
		//如果选中其他数字，则显示输入错误，并重新调用菜单函数 ,直到选中1开始游戏
		switch(m)
		{
		case 1:
			break;
		case 2:
			System.out.println("the Ruler is : choose the correct number ");
			System.out.println("the game diffluct have list 1 : 1~10, 2 : 2~20, 3 : 1~30， 4 : 1~40");
			System.out.println(" diffcult 1: loss 1, score 2 : loss 2, 3 : loss 3, 4: loss 4");
			printMenu();
			break;
		case 3:
			System.out.println("the diffluct you can set is  1 : 1~10, 2 : 2~20, 3 : 1~30， 4 : 1~40");
			int dTest = in.nextInt();
			
			//难度正确输入检测
			while((dTest < 1) || (dTest > 4))
			{
				System.out.println("1 to 4");
				dTest = in.nextInt();
			}
			diffcult = dTest;
			printMenu();
			break;
		default:
			System.out.println("please enter the number : 1 to 3");
			printMenu();
			break;
		}
		
		//in.close();
		
	}
	
	//扣分机制
	public boolean lossScore()
	{
		if(score < 0)
			return false;
		
		score -= 1 * diffcult;
		return true;
	}


	
	//充钱函数
	public void setScore(int m)
	{
		if(m>1000)
		{
			System.out.println("you are so greedy");
			score = 0;	
		}
		else if(m < 0)
		{
			System.out.println("Are you kiding me,make you dream come true");
			score = m;
		}
		else
			score = m;
	}
	
	//返回难度函数
	public int getDiffcult()
	{
		return diffcult;
	}
	
	
	

}
