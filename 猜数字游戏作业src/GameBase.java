
/**
 * 
 * @author ����
 * @version java 10
 * 
 * ���ԣ�
 * 		�û��÷֣������
 * ����:
 * 		����
 * 		�����������
 * 		�÷��ۼ�
 *		������ļ��
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
		score = 6;
		randomNumber = -1;
		diffcult = 1;
	}
	
	//�������������
	public void setRandomNumber()
	{
		randomNumber = (int)(Math.random() * (diffcult * 10)) + 1;
	}
	
	
	public int getRandomNumber()
	{
		return randomNumber;
	}
	
	//�˵���ӡ
	public void printMenu()
	{
		System.out.println("********* Wellcom to paly Guess Game ********* ");
		System.out.println("********* 1 : crate new game *********");
		System.out.println("********* 2 : game help *********");
		System.out.println("********* 3 : set diffcult *********");
		Scanner in  = new Scanner(System.in);
		
		int m = in.nextInt();
		
		
		//���2��3���,�����˵������2��3��ݹ����һ�θú���������ӡ�˵���
		//���ѡ���������֣�����ʾ������󣬲����µ��ò˵����� ,ֱ��ѡ��1��ʼ��Ϸ
		switch(m)
		{
		case 1:
			break;
		case 2:
			System.out.println("the Ruler is : choose the correct number ");
			System.out.println("the game diffluct have list 1 : 1~10, 2 : 2~20, 3 : 1~30�� 4 : 1~40");
			System.out.println(" diffcult 1: loss 1, score 2 : loss 2, 3 : loss 3, 4: loss 4");
			printMenu();
			break;
		case 3:
			System.out.println("the diffluct you can set is  1 : 1~10, 2 : 2~20, 3 : 1~30�� 4 : 1~40");
			int dTest = in.nextInt();
			
			//�Ѷ���ȷ������
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
	
	//�۷ֻ���
	public boolean lossScore()
	{
		if(score < 0)
			return false;
		
		score -= 1 * diffcult;
		return true;
	}


	
	//��Ǯ����
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
	
	//�����ѶȺ���
	public int getDiffcult()
	{
		return diffcult;
	}
	
	
	

}
