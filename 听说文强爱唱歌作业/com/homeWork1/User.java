package com.homeWork1;
import java.util.Scanner;

public class User 
{
	private Song USong;
	
	public User()
	{
		USong = new Song();
	}
	
	public Song BookSong()
	{
		Scanner userIn = new Scanner(System.in);
		System.out.println("��������������� ���ơ�ԭ�����֡�����ʱ��");
		USong.setName(userIn.next());
		USong.setSinger(userIn.next());
		USong.setSongTime(userIn.nextFloat());
		//userIn.close();
		return USong;
	}
}
