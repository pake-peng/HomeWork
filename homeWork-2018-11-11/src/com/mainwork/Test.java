package com.mainwork;


/**
 * @author ����
 * @aim ������һ������һ�����еľ�����ˣ����õ��̣߳������ʱ��
 * Ȼ���÷ֿ����ķ������ֱ��2��4��8��16��32���߳�����ͳ�ƺ�ʱ�����ͼ��
 * ������CPU���ܺ��ڴ��С
 */
public class Test 
{
	
	public static void main(String[] args)
	{
		/*Matrix m1= new Matrix((int)(1e3),(int)(1e3));
		Matrix m2= new Matrix((int)(1e3),(int)(1e3));*/
		
		/*long startTime1=System.currentTimeMillis();
		m1.InitMatix();
		long endTime1=System.currentTimeMillis();
		System.out.println("m1 ��ʼ��ʱ��" + (endTime1 - startTime1) + " mm");
		
		long startTime2=System.currentTimeMillis();
		m2.InitMatix();
		long endTime2=System.currentTimeMillis();
		System.out.println("m2 ��ʼ��ʱ��" + (endTime2 - startTime2)+ " mm");*/
		
		/*long startTime3=System.currentTimeMillis();
		Matrix mResult = Matrix.MultiMatrix(m1, m2);
		long endTime3=System.currentTimeMillis();
		System.out.println("m1 x m2  ʱ��" + (endTime3 - startTime3 + " mm"));*/
		
		/*long startTime4=System.currentTimeMillis();
		mResult.PrintMatrix();
		long endTime4=System.currentTimeMillis();
		System.out.println("������ά����ʱ��" + (endTime4 - startTime4));
		*/
		
		/*�������̶߳Ծ�����˵�����*/
		int[][] m1 = new int[(int)1e3 * 6 ][(int)1e3 * 6];
		int[][] m2 = new int[(int)1e3 * 6][(int)1e3 * 6];
		MThreadMatrix Mtm = new MThreadMatrix(m1, m2); //��MThreadMatrix�н���1000 X 1000�ľ������
		
		MartixThread.MT = Mtm;//�����������̲߳���
		int SumThread = 30;
		
		//ע�⣺ cnt��int���ͣ��������������������߳����Ǹ������ữΪ���Σ�������м���ᶪʧһ�������������Ҳ�����в�������û���������
		MartixThread.cnt = Mtm.getRow() / SumThread;  //���վ����ܺ��� / �߳���
		
		long startTime3=System.currentTimeMillis();
		for(int i=0; i<SumThread; i++) //���������߳�
		{
			new MartixThread("�߳�" + i).start();
		}
		
		while(Mtm.line < m1.length)
		{
			try
			{
				Thread.sleep(1);
				//System.out.println("�ȴ��̴߳�����");
				//System.out.println("�����" + MThreadMatrix.line + " �д�����");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		long endTime3=System.currentTimeMillis();
		System.out.println( SumThread + "���߳� " + " ���� m1 x m2  ʱ��" + (endTime3 - startTime3 + " mm"));
		
		
	}
}
