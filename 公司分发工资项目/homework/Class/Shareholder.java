package homework.Class;


import java.util.Date;

public class Shareholder extends Employee
{

	private double share; //股份
	private int bouns; //应得分红
	private  static double shareSum = 0.0 ; //用来存放股东总股份，以免超过了1
	public static int count = 0; //股东计数
	
	/**
	 * @param name
	 * @param salary
	 * @param birthday
	 * 由股份总和是否超过的检测
	 */
	public Shareholder(String name, int salary, String birthday, double share) 
	{
		super(name, salary, birthday);
		if(share >= 1.0)
		{
			System.out.println("股份已经分完了，没有股份分了");
			System.exit(-1);
		}
		if(share > 0 && share < 1.0)
		{
			this.share = share;
			shareSum += share;
			count++;
		}
		else
			System.out.println("股份输入错误，重新输入");
	}
	
	public Shareholder()
	{
		super();
	}
	public double getShare() {
		return share;
	}
	
	
	public int getBouns() {
		return bouns;
	}

	//分红等于公司总利润得0.1，按股份平分
	public int setBouns(int profitYear) 
	{
		return (int)(profitYear * 0.1 * share);
	}

	public void attributeSalary()
	{
		System.out.println("股东工资 ： " + (super.getSalary() + getBouns()) );
		attribureShare();
	}
	
	public void attributeGift()
	{
		//空函数，因为股东没有工资
	}
	
	public void setShare(int profitSum)
	{
		bouns = (int)(profitSum * share);
	}
	
	public void attribureShare()
	{
		System.out.println("股东分红为 ： " + bouns);
	}
	
}
