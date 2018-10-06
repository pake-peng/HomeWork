package com.homeWork1;

import java.util.ArrayList;

/*
 * 定义一个主持人类，主持人可以播放歌曲，也可以指定播放一首歌曲
 * 主持人按照播放列表中的歌曲按顺序播放，主持人也可以指定一首播放列表的歌曲
 */
public class HostMen
{
	private int number; //用来记录正在播放歌曲的序号
	
	public HostMen()
	{
		number = 0;
	}
	public void playMusic(ArrayList<Song> s)
	{
		System.out.print("目前正在播放" );
		s.get(number++).PrintSong();
	}
	public int getNumber()
	{
		return number;
	}
	public void orderSong(int aNumber, ArrayList<Song> s)
	{
		number = aNumber;
		playMusic(s);
	}
	
}
