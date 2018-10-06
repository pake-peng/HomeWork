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
		System.out.println("请依次输入歌曲的 名称、原唱歌手、歌曲时长");
		USong.setName(userIn.next());
		USong.setSinger(userIn.next());
		USong.setSongTime(userIn.nextFloat());
		//userIn.close();
		return USong;
	}
}
