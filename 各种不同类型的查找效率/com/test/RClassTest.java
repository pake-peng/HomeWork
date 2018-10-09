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
 * description list,map,set的查找速度的测试
 * @author 彭湃
 * 
 */
 
 class RClass
{
	Random r = new Random();
	/**
	 * 通过程序测试list set tree hashset hashlist谁的查找速度更快（规模为1000~1000000）
  		利用计时工具，将结果通过Excel画出（假期完成）
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
		 * 先给数组赋上1-1000的随机值，然后再向其中10w个数组里面赋一不一样的数，然后最后查找这个不一样的数
		 * 因为后面有链式存储，所以用统一的随机查找，不采用注释中的特别处理
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
		
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	list.contains(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
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
        
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	list.contains(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
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
        
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	list.contains(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
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
        
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	hash.contains(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
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
        
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	tree.contains(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
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
        
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	map.containsValue(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
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
        
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	map.containsValue(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
	    return (end-start)/times;    
	}
}

public class RClassTest {
	public static void main(String[] args) {
		RClass demo = new RClass();

		// 经测试50个数据求平均时的误差较小
		System.out.println("ArrayList:"+demo.getArrayListTime(50)+" ns");
		System.out.println("LinkedList:"+demo.getLinkedListTime(50)+" ns");
		System.out.println("Vector:"+demo.getVectorTime(50)+" ns");
		System.out.println("HashSet:"+demo.getHashSetTime(50)+" ns");
		System.out.println("TreeSet:"+demo.getTreeSetTime(50)+" ns");
		// containsValue查询的时间
		System.out.println("HashMap:"+demo.getHashMapTime(10)+" ns");
		System.out.println("TreeMap:"+demo.getTreeMapTime(10)+" ns");	
		// 键值对get查询的时间
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
        long start=System.nanoTime(); //获取开始时间
        for(int x=0;x<times;x++)
        	map.get(r.nextInt(10000));
        long end=System.nanoTime(); //获取结束时间
      
	    return (end-start)/times;
	}
	
}
