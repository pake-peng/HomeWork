package com.mainwork;

/**
 * @author 彭湃
 *	用于多线程的矩阵相乘的快速运算
 *	思路：
 *		讲矩阵A划分为一行行来进行多线程运算。每个线程A的一行与相对应的矩阵B进行运算。运算后的结果要存入resul中
 */
public class MThreadMatrix 
{
	private int [][] matrix1;
	private int [][] matrix2;
	
	private int [][] result;
	
	private int row; //矩阵对象的行
	private int col; //矩阵对象的列
	
	public static int line;

	
	/**
	 * @param matrix1
	 * @param matrix2
	 * 矩阵的一行相乘
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
