package com.mainwork;

public class MartixThread extends Thread
{
	public static MThreadMatrix MT; //�洢�߳�Ҫ����������
	public static int cnt; //һ���߳�Ҫִ�м���d���
	
	/**
	 * @param name һ���̶߳��������
	 * @param ThreadCnt Ҫ�������߳���
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
				System.out.println(this.getName() + " ��ʼ����");
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
					Thread.sleep(100); //����������Ϊ�˱����̳߳�ͻ
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}*/
			
			//����ͬ����ʱ��������ѭ��������
			/*while(MT.line <= MT.getRow())
			{
				MT.mulMartix();
			}*/
			
			//��ͬ�������Ը��ȶ���������
			for(int i=0; i<cnt; i++)
			{
				MT.mulMartix();
			}
		}
	}
	
	
}
