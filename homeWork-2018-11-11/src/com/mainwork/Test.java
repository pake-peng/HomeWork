package com.mainwork;


/**
 * @author 彭湃
 * @aim 让两个一百万行一百万列的矩阵相乘，先用单线程，计算耗时，
 * 然后用分块矩阵的方法，分别分2、4、8、16、32个线程做，统计耗时，绘出图表，
 * 并附上CPU性能和内存大小
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
		System.out.println("m1 初始化时间" + (endTime1 - startTime1) + " mm");
		
		long startTime2=System.currentTimeMillis();
		m2.InitMatix();
		long endTime2=System.currentTimeMillis();
		System.out.println("m2 初始化时间" + (endTime2 - startTime2)+ " mm");*/
		
		/*long startTime3=System.currentTimeMillis();
		Matrix mResult = Matrix.MultiMatrix(m1, m2);
		long endTime3=System.currentTimeMillis();
		System.out.println("m1 x m2  时间" + (endTime3 - startTime3 + " mm"));*/
		
		/*long startTime4=System.currentTimeMillis();
		mResult.PrintMatrix();
		long endTime4=System.currentTimeMillis();
		System.out.println("遍历二维数组时间" + (endTime4 - startTime4));
		*/
		
		/*用两个线程对矩阵相乘得运算*/
		int[][] m1 = new int[(int)1e3 * 6 ][(int)1e3 * 6];
		int[][] m2 = new int[(int)1e3 * 6][(int)1e3 * 6];
		MThreadMatrix Mtm = new MThreadMatrix(m1, m2); //在MThreadMatrix中建立1000 X 1000的矩阵对象
		
		MartixThread.MT = Mtm;//讲矩阵放入多线程操作
		int SumThread = 30;
		
		//注意： cnt是int类型，如果你矩阵总行数除以线程数是浮点数会化为整形，后面的行计算会丢失一部分运算次数，也就是有部分行数没计算出来！
		MartixThread.cnt = Mtm.getRow() / SumThread;  //最终矩阵总函数 / 线程数
		
		long startTime3=System.currentTimeMillis();
		for(int i=0; i<SumThread; i++) //创建几个线程
		{
			new MartixThread("线程" + i).start();
		}
		
		while(Mtm.line < m1.length)
		{
			try
			{
				Thread.sleep(1);
				//System.out.println("等待线程处理完");
				//System.out.println("矩阵第" + MThreadMatrix.line + " 行处理完");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		long endTime3=System.currentTimeMillis();
		System.out.println( SumThread + "个线程 " + " 处理 m1 x m2  时间" + (endTime3 - startTime3 + " mm"));
		
		
	}
}
