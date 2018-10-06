package com.homeWork1;

/**
 * 
 * @author 彭湃
 *
 */

/*
 * 定义一个歌曲信息类，包含歌曲的名称、原唱歌手，歌曲时长等信息。
 */
public class Song 
{
	private String name;
	private String singer;
	private float songTime;
	
	public Song()
	{
		name= "";
		singer = "";
		songTime = 0;
	}
	
	public Song(String aName, String aSinger, float aSongTime)
	{
		name = aName;
		singer = aSinger;
		songTime = aSongTime;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSinger()
	{
		return singer;
	}
	
	public float getSongTime()
	{
		return songTime;
	}
	
	public void setName(String aName)
	{
		name = aName;
	}
	
	public void setSinger(String aSinger)
	{
		singer = aSinger;
	}
	
	public void setSongTime(float aSongTime)
	{
		songTime = aSongTime;
	}
	
	public void PrintSong()
	{
		System.out.println("  歌曲名 :" + name + "  原唱歌手 :" + singer + "  歌曲时长 :" + songTime);
	}
}
