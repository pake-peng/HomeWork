package com.homeWork1;

import java.util.ArrayList;

/*
 * ����һ���������࣬�����˿��Բ��Ÿ�����Ҳ����ָ������һ�׸���
 * �����˰��ղ����б��еĸ�����˳�򲥷ţ�������Ҳ����ָ��һ�ײ����б�ĸ���
 */
public class HostMen
{
	private int number; //������¼���ڲ��Ÿ��������
	
	public HostMen()
	{
		number = 0;
	}
	public void playMusic(ArrayList<Song> s)
	{
		System.out.print("Ŀǰ���ڲ���" );
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
