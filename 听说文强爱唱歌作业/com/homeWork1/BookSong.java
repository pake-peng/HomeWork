package com.homeWork1;

import java.util.ArrayList;
import java.util.Scanner;


/*
 * 用户可以点歌，主持人来播放歌曲
 */
public class BookSong 
{
	private HostMen HM; //一个点歌系统只要一个主持人
	//private User[] u; //一个点歌系统可以有多个用户
	/*public static final int MAX_USER = 50;  //用户数量限制
	public static final int MAX_SONGS = 100; //播放列表的最大歌曲liang
*/	
	private final ArrayList<User> AUser; //动态用户的存储
	private final ArrayList<Song> ASong; //动态歌曲的存储
	
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
				ASong.add(AUser.get(AUser.size()-1).BookSong()); //将添加的用户所选的歌曲添加到歌曲库里面
				break;
			case 2:
				HM.playMusic(ASong);
				break;
			case 3:
				System.out.println("歌曲库目前有 " + ASong.size() + "首歌" + " 请选择你想点播的歌曲名");
				int i;
				for(i=0; i<ASong.size(); i++)
				{
					ASong.get(i).getName().equals(Start_in.next()); //遍历歌曲库，找到和歌曲
				}
				HM.orderSong(i, ASong);
				break;
			}
		}

	}
	
}
