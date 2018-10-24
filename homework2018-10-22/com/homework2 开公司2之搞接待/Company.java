package com.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company 
{
	private static ArrayList<Student> s;
	private static ArrayList<Parents> p;
	private static ArrayList<Teacher> t;
	private static ArrayList<Boss> b;
	private static ArrayList<ForeignGuests> fg;

	public Company()
	{
		s = new ArrayList<Student>();
		p = new ArrayList<Parents>();
		t = new ArrayList<Teacher>();
		b = new ArrayList<Boss>();
		fg = new ArrayList<ForeignGuests>();
	}

	public void add()
	{
		s.add(new Student());
		Scanner in = new Scanner(System.in);
		System.out.println("���������� ѧ�� �ĳ����� Ŀ�ĵ� �Ӵ�����");
		try
		{
			s.get(s.size() - 1).setStartPlace(in.next());
			s.get(s.size() - 1).setArrivePlace(in.next());
			s.get(s.size() - 1).setReserveDuring(in.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("��ʽ�� ������ Ŀ�ĵ� �Ӵ�����");
			System.out.println("�Ӵ���������������");
		}
		p.add(new Parents());
		System.out.println("���������� �ҳ� �ĳ����� Ŀ�ĵ� �Ӵ�����");
		try
		{
			p.get(p.size() - 1).setStartPlace(in.next());
			p.get(p.size() - 1).setArrivePlace(in.next());
			p.get(p.size() - 1).setReserveDuring(in.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("��ʽ�� ������ Ŀ�ĵ� �Ӵ�����");
			System.out.println("�Ӵ���������������");
		}
		t.add(new Teacher());
		System.out.println("������������ʦ �ĳ����� Ŀ�ĵ� �Ӵ�����");
		try
		{
			t.get(t.size() - 1).setStartPlace(in.next());
			t.get(t.size() - 1).setArrivePlace(in.next());
			t.get(t.size() - 1).setReserveDuring(in.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("��ʽ�� ������ Ŀ�ĵ� �Ӵ�����");
			System.out.println("�Ӵ���������������");
		}
		b.add(new Boss());
		System.out.println("�����������ϰ� �ĳ����� Ŀ�ĵ� �Ӵ�����");
		try
		{
			b.get(b.size() - 1).setStartPlace(in.next());
			b.get(b.size() - 1).setArrivePlace(in.next());
			b.get(b.size() - 1).setReserveDuring(in.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("��ʽ�� ������ Ŀ�ĵ� �Ӵ�����");
			System.out.println("�Ӵ���������������");
		}
		fg.add(new ForeignGuests());
		System.out.println("���������� ��� �ĳ����� Ŀ�ĵ� �Ӵ�����");
		try
		{
			fg.get(fg.size() - 1).setStartPlace(in.next());
			fg.get(fg.size() - 1).setArrivePlace(in.next());
			fg.get(fg.size() - 1).setReserveDuring(in.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("��ʽ�� ������ Ŀ�ĵ� �Ӵ�����");
			System.out.println("�Ӵ���������������");
		}
	}

	public void show()
	{
		for(Student s1 : s)
		{
			
			

			s1.printCost();
		}
		for(Parents p1 : p)
		{
			

			p1.printCost();
		}
		for(Teacher t1: t)
		{
			

			t1.printCost();
		}
		for(Boss b1 : b)
		{
			

			b1.printCost();
		}
		for(ForeignGuests fg1 : fg)
		{

			fg1.printCost();
		}
	}


}
