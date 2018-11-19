package com.mainwork;

/**
 * @author ����
 *	���ڶ��̵߳ľ�����˵Ŀ�������
 *	˼·��
 *		������A����Ϊһ���������ж��߳����㡣ÿ���߳�A��һ�������Ӧ�ľ���B�������㡣�����Ľ��Ҫ����resul��
 */
public class MThreadMatrix 
{
	private int [][] matrix1;
	private int [][] matrix2;
	
	private int [][] result;
	
	private int row; //����������
	private int col; //����������
	
	public static int line;

	
	/**
	 * @param matrix1
	 * @param matrix2
	 * �����һ�����
	 */
	public MThreadMatrix(int[][] matrix1, int[][] matrix2) 
	{
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.result = new int[this.matrix1.length][this.matrix2[0].length];
		
		row = result.length;
		col = result[0].length;
		line = 0;
	}
	
	public void mulMartix()
	{
		
			for(int i=0; i<matrix1[0].length; i++)
			{
				int sum=0;
				for(int j=0; j<matrix2.length; j++)
				{
					sum += matrix1[line][j] * matrix2[i][j];
				}
				result[line][i] = sum;
			}
			++line;
		
	}

	public int getRow() {
		return row;
	}


	public int getCol() {
		return col;
	}

	
	
	
	
}
