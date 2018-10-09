package com.test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import java.util.HashSet;
import java.util.TreeSet;

import java.util.HashMap;
import java.util.TreeMap;

import java.util.Random;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Title FindEffect.java
 * description list,map,set�Ĳ����ٶȵĲ���
 * @author ����
 * 
 */
 
 class RClass
{
	Random r = new Random();
	/**
	 * ͨ���������list set tree hashset hashlist˭�Ĳ����ٶȸ��죨��ģΪ1000~1000000��
  		���ü�ʱ���ߣ������ͨ��Excel������������ɣ�
	 */
	public long getArrayListTime(int times)
	{
		List<Integer> list = new ArrayList<Integer>();
        int i;
        while(list.size() < 10000){
            i = r.nextInt(10000);
            if(!list.contains(i)){
                list.add(i);
            }
        }
		
		/*
		 * �ȸ����鸳��1-1000�����ֵ��Ȼ����������10w���������渳һ��һ��������Ȼ�������������һ������
		 * ��Ϊ��������ʽ�洢��������ͳһ��������ң�������ע���е��ر���
		/*long start = System.currentTimeMillis();
		for(int i=0; i<times; i++)
		{
			int Lvariable = r.nextInt(100000);
			list.set(Lvariable, 1100);
			list.contains(1100);
			list.set(Lvariable, r.nextInt(1000));
		}
		long end = System.currentTimeMillis();
		
		return end-start;*/
		
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	list.contains(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;
		
	}
	
	public long getLinkedListTime(int times) {
		List<Integer> list = new LinkedList<Integer>();
        int i;
        while(list.size() < 10000){
            i = r.nextInt(10000);
            if(!list.contains(i)){
                list.add(i);
            }
        }
        
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	list.contains(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;  
	}
	
	public long getVectorTime(int times) {
		List<Integer> list = new Vector<Integer>();
        int i;
        while(list.size() < 10000){
            i = r.nextInt(10000);
            if(!list.contains(i)){
                list.add(i);
            }
        }
        
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	list.contains(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;  
	}
	
	public long getHashSetTime(int times) {
		HashSet<Integer> hash = new HashSet<Integer>();
        int i;
        while(hash.size() < 10000){
            i = r.nextInt(10000);
            if(!hash.contains(i)){
                hash.add(i);
            }
        }
        
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	hash.contains(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;   
	}
	
	public long getTreeSetTime(int times) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
        int i;
        while(tree.size() < 10000){
            i = r.nextInt(10000);
            if(!tree.contains(i)){
                tree.add(i);
            }
        }
        
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	tree.contains(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;   
	}
	
	public long getHashMapTime(int times) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int i;
        for(int j=0; map.size() < 10000; j++){
            i = r.nextInt(10000);
            if(!map.containsValue(i)){
                map.put(j,i);
            }
        }
        
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	map.containsValue(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;    
	}
	
	public long getTreeMapTime(int times) {
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        int i;
        for(int j=0; map.size() < 10000; j++){
            i = r.nextInt(10000);
            if(!map.containsValue(i)){
                map.put(j,i);
            }
        }
        
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	map.containsValue(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;    
	}
}

public class RClassTest {
	public static void main(String[] args) {
		RClass demo = new RClass();

		// ������50��������ƽ��ʱ������С
		System.out.println("ArrayList:"+demo.getArrayListTime(50)+" ns");
		System.out.println("LinkedList:"+demo.getLinkedListTime(50)+" ns");
		System.out.println("Vector:"+demo.getVectorTime(50)+" ns");
		System.out.println("HashSet:"+demo.getHashSetTime(50)+" ns");
		System.out.println("TreeSet:"+demo.getTreeSetTime(50)+" ns");
		// containsValue��ѯ��ʱ��
		System.out.println("HashMap:"+demo.getHashMapTime(10)+" ns");
		System.out.println("TreeMap:"+demo.getTreeMapTime(10)+" ns");	
		// ��ֵ��get��ѯ��ʱ��
		System.out.println();
		System.out.println("HashMap:"+hashTime(50)+" ns");

	}
	public static long hashTime(int times) {
		Random  r = new Random();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int i;
        for(int j=0; map.size() < 10000; j++){
            i = r.nextInt(10000);
            if(!map.containsValue(i)){
                map.put(j,i);
            }
        }      
        long start=System.nanoTime(); //��ȡ��ʼʱ��
        for(int x=0;x<times;x++)
        	map.get(r.nextInt(10000));
        long end=System.nanoTime(); //��ȡ����ʱ��
      
	    return (end-start)/times;
	}
	
}
