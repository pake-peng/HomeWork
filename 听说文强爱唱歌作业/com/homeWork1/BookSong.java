package com.homeWork1;

import java.util.ArrayList;
import java.util.Scanner;


/*
 * �û����Ե�裬�����������Ÿ���
 */
public class BookSong 
{
	private HostMen HM; //һ�����ϵͳֻҪһ��������
	//private User[] u; //һ�����ϵͳ�����ж���û�
	/*public static final int MAX_USER = 50;  //�û���������
	public static final int MAX_SONGS = 100; //�����б��������liang
*/	
	private final ArrayList<User> AUser; //��̬�û��Ĵ洢
	private final ArrayList<Song> ASong; //��̬�����Ĵ洢
	
	public BookSong()
	{
		HM = new HostMen();
		AUser = new ArrayList<User>();
		ASong = new ArrayList<Song>();
	}
	
	public void Start()
	{
		Scanner Start_in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Do you want to addSong or playSongs");
			System.out.println("1 : addSong, 2 : playSongs, 3 : chose a Song to play ");
			switch(Start_in.nextInt())
			{
			case 1: 
				AUser.add(new User());
				ASong.add(AUser.get(AUser.size()-1).BookSong()); //����ӵ��û���ѡ�ĸ�����ӵ�����������
				break;
			case 2:
				HM.playMusic(ASong);
				break;
			case 3:
				System.out.println("������Ŀǰ�� " + ASong.size() + "�׸�" + " ��ѡ������㲥�ĸ�����");
				int i;
				for(i=0; i<ASong.size(); i++)
				{
					ASong.get(i).getName().equals(Start_in.next()); //���������⣬�ҵ��͸���
				}
				HM.orderSong(i, ASong);
				break;
			}
		}

	}
	
}
