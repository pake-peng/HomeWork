import java.util.Scanner;

/**
 * 
 * @author ����
 * ���ԣ�
 * 		����
 * 		��Ϸ����
 * ����:
 *		��ʼ��Ϸ
 *		������Ϸ
 *		��ʾ�÷�
 *		�˳���Ϸ
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
	
	//��ʼ��Ϸ����
	public void StartGame()
	{
		Scanner inpute = new Scanner(System.in);
		
		//��һ�ν�����Ϸ��������Ϣ����
		if (continueGame == true)
		{
			gb.printMenu();
			System.out.println("*** please enter you name ***");
			setName(inpute.next());
			System.out.println("@" + name + " welcom to Peng Pai game , good luck to you" );
			System.out.println("you orginal score is 6  come on !!!!" );
		}
		
		gb.setRandomNumber();
		//������¼ϵͳ�����������
		int n = gb.getRandomNumber(); 
		boolean testScore =true;
		
		//ѭ������ж���ֵ�Ƿ���ȷ
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
		
		//���ֲ����Ĵ���ʽ
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
			System.out.println("*******��ϲ����ʤ�� ������" + gb.getDiffcult() * 20 + "����    ******* ");
		
		System.out.println("Do you want to come on Y/N");
		String s = inpute.next();
		
		//����Ƿ������Ϸ
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
