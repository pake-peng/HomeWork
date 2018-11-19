package com.mainwork;

public class MartixThread extends Thread
{
	public static MThreadMatrix MT; //存储线程要操作的数组
	public static int cnt; //一个线程要执行几行d相乘
	
	/**
	 * @param name 一个线程对象的名字
	 * @param ThreadCnt 要创建的线程数
	 */
	public MartixThread(String name)
	{
		super();
		setName(name);
	}
	
	public MartixThread()
	{
		super();
	}
	
	public void run()
	{
		synchronized(MThreadMatrix.class)
		{
			try
			{
				//System.out.println(Thread.currentThread().getName());
				System.out.println(this.getName() + " 开始运行");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			/*try
			{
				Thread.sleep(10);
				for(int i=0; i<cnt; i++)
				{
					MT.mulMartix();
					Thread.sleep(100); //设置休眠是为了避免线程冲突
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}*/
			
			//不加同步的时候，用无线循环的做法
			/*while(MT.line <= MT.getRow())
			{
				MT.mulMartix();
			}*/
			
			//加同步，可以给稳定次数做法
			for(int i=0; i<cnt; i++)
			{
				MT.mulMartix();
			}
		}
	}
	
	
}
