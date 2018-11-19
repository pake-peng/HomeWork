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
		matrix =  new T[][]; //�������鴴��ʧ�ܣ��������ת����Ŀǰδ��ȷ
		for(int i=0; i<raw; i++)
		{
			matrix[i]
		}
	}
}*/

/**
 * @author ����
 * ���߳�һ�����Ļ�����������
 *
 */
public class Matrix
{
	private int[][] matrix;
	private int m_row;
	private int m_col;
	
	public static int line = 0; //�ڶ��̲߳����м�¼��ǰ�����������ļ���
	public Matrix()
	{
		matrix=null;
	}
	
	
	/**
	 * @param raw
	 * @param col
	 * ���У���֤��ʼ��
	 */
	public Matrix(int raw, int col)
	{
		m_row = raw;
		m_col = col;
		matrix =  new int[raw][]; //�������鴴��ʧ�ܣ��������ת����Ŀǰδ��ȷ
		for(int i=0; i<raw; i++)
		{
			matrix[i] = new int[col];
		}
		
	}
	
	
	/**
	 * @param A
	 * @param B
	 * ���߳̾���ü���
	 * @return
	 */
	public static Matrix MultiMatrix(Matrix A, Matrix B)
	{
		if(A.matrix ==null || B.matrix == null)
		{
			System.out.println("����δ��ʼ����ֵ");
			return null;
		}
			
		if(A.matrix[0].length != B.matrix.length)
		{
			System.out.println("�þ��������");
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

