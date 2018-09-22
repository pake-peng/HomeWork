import java.util.Scanner;

/**
 * 
 * @author 彭湃
 * 属性：
 * 		姓名
 * 		游戏对象
 * 方法:
 *		开始游戏
 *		继续游戏
 *		显示得分
 *		退出游戏
 *		
 */

public class Player 
{
	private String name;
	private GameBase gb;
	private boolean continueGame;
	public Player()
	{
		gb = new GameBase();
		continueGame = true;
	}
	
	//开始游戏函数
	public void StartGame()
	{
		Scanner inpute = new Scanner(System.in);
		
		//第一次进入游戏弹出的信息输入
		if (continueGame == true)
		{
			gb.printMenu();
			System.out.println("*** please enter you name ***");
			setName(inpute.next());
			System.out.println("@" + name + " welcom to Peng Pai game , good luck to you" );
			System.out.println("you orginal score is 8 come on !!!!" );
		}
		
		gb.setRandomNumber();
		//用来记录系统产生的随机数
		int n = gb.getRandomNumber(); 
		boolean testScore =true;
		
		//循环检测判断数值是否正确
		while(testScore && true )
		{
			System.out.println("please enter you guess Number");
			int Gnumber = inpute.nextInt();
			if( Gnumber == n)
				break;
			System.out.println("it is pity that " +  Gnumber + " is not correct number");
			System.out.println("you have lost " + gb.getDiffcult() * 1 + " score!");
			testScore = gb.lossScore();
		}
		
		//积分不够的处理方式
		if(testScore == false)
		{
			System.out.println("the score less than 0");
			System.out.println("Do you want to revenge,1: please give money or 2 : get out of game");
			int r1 = inpute.nextInt();
				switch(r1)
				{
				case 1: 
					System.out.println("enter the money number");
					gb.setScore(inpute.nextInt());
					System.out.println("thank to peng pai!, he had paid for you!!!!!");
					break;
				case 2:
					System.exit(-1);
				default:
					System.out.println("there is no choice ,unless you are vip, game over!");
					System.exit(-1);
					break;
				}
		}
		
		else
			System.out.println("*******恭喜你获得胜利 ，你获得" + gb.getDiffcult() * 20 + "积分    ******* ");
		
		System.out.println("Do you want to come on Y/N");
		String s = inpute.next();
		
		//检测是否继续游戏
		while(true)
		{
			if(s.equals("Y"))
			{
				continueGame = false;
				System.out.println("this game is so attracted for you yeah? e"
						+ "njoy the game absolutely");
				StartGame();
				
				break;
			}
			if(s.equals("N"))
			{
				System.exit(-1);
				break;
			}
			System.out.println("cheak you char");
			s = inpute.next();
		}
		
		inpute.close();
	}
	
	public static void main(String[] args)
	{
		Player p1 = new Player();
		p1.StartGame();
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public void setContinueGame()
	{
		continueGame = false;
	}
	
}
