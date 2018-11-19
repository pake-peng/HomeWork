package com.mainwork;

import java.util.Random;

/*public class Matrix<T>
{
	private T[][] matrix;
	
	
	public Matrix()
	{
		matrix=null;
	}
	
	public <T>  Matrix(int raw, int col)
	{
		matrix =  new T[][]; //泛型数组创建失败，具体如何转换，目前未明确
		for(int i=0; i<raw; i++)
		{
			matrix[i]
		}
	}
}*/

/**
 * @author 彭湃
 * 单线程一般矩阵的基本操作方法
 *
 */
public class Matrix
{
	private int[][] matrix;
	private int m_row;
	private int m_col;
	
	public static int line = 0; //在多线程操作中记录当前参与计算得是哪几行
	public Matrix()
	{
		matrix=null;
	}
	
	
	/**
	 * @param raw
	 * @param col
	 * 行列，举证初始化
	 */
	public Matrix(int raw, int col)
	{
		m_row = raw;
		m_col = col;
		matrix =  new int[raw][]; //泛型数组创建失败，具体如何转换，目前未明确
		for(int i=0; i<raw; i++)
		{
			matrix[i] = new int[col];
		}
		
	}
	
	
	/**
	 * @param A
	 * @param B
	 * 单线程矩阵得计算
	 * @return
	 */
	public static Matrix MultiMatrix(Matrix A, Matrix B)
	{
		if(A.matrix ==null || B.matrix == null)
		{
			System.out.println("矩阵未初始化赋值");
			return null;
		}
			
		if(A.matrix[0].length != B.matrix.length)
		{
			System.out.println("该矩阵不能相乘");
			return null;
		}
		
		Matrix m = new Matrix(A.m_row, B.m_col);
		for(int i=0; i<A.m_col; i++)
		{
			for(int j=0; j<A.m_col; j++)
			{
				for(int k=0; k<B.m_row; k++)
				{
					m.matrix[i][j] = A.matrix[i][j] * B.matrix[k][i];
				}
			}
		}
		
		return m;
	}
	
	public void InitMatix()
	{
		Random r = new Random();
		for(int i=0; i<m_row; i++)
		{
			for(int j=0; j<m_col; j++)
			{
				matrix[i][j] = r.nextInt(10);
			}
		}
		
	}
	
	public void PrintMatrix()
	{
		for(int i=0; i<m_row; i++)
		{
			for(int j=0; j<m_col; j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}

