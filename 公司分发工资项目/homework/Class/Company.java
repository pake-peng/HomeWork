package homework.Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Company 
{
	public static int MAX_EMPLOYEE_NUMBER = 100;
	public static int MAX_MANAGER_NUMBER = 10;
	public static int MAX_SHAREHOLDER_NUMBER = 10;
	
	private int profitSum = 0; //公司的利润总和
	private Employee[] e; //公司的职员集合
	private Manager[]  m; //公司的经理集合
	private	Shareholder[] sh; //公司的股东集合
	private String EGift;  //公司分发员工礼物
	private String MGift;	//公司分发经理礼物
	
	/*
	 * 公司的各个职员的集合大小初始化
	 * 公司的总利润的促使化
	 */
	public Company() 
	{
		this.e = new Employee[MAX_EMPLOYEE_NUMBER];
		this.m = new Manager[MAX_MANAGER_NUMBER];
		this.sh = new Shareholder[MAX_SHAREHOLDER_NUMBER];
		profitSum = (int)(Math.random() * 1000000);
	}
	
	
	public String getEGift() {
		return EGift;
	}
	public void setEGift(String eGift) {
		EGift = eGift;
	}
	public String getMGift() {
		return MGift;
	}
	public void setMGift(String mGift) {
		MGift = mGift;
	}
	
	/*
	 * 发工资的促使化
	 * 注意employee父类个其他两个子类的关系
	 * 
	 */
	public void distribute()
	{
		/*
		 * manager和Shareholder创建对象时，会调用职员构造函数，导致职员的static 人数发生变化，
		 * 后面通过数组调用也会收到影响
		 * 
		 * 如果数组赋值了new好的大小，那么不能直接 用 for(class c : C[])，因为后面没初始化的成员
		 * 同理，数组的.length也是，数组总大小，而不是数组已经初始化的大小
		 * 
		 */
		
		for(int i =0; i<Employee.count - Manager.count - Shareholder.count ; i++)
		{
			e[i].setGift(EGift);
			e[i].attributeSalary();
		}
		for(int i =0; i<Manager.count; i++)
		{
			m[i].setGift(MGift);
			m[i].attributeSalary();
		}
		for(int i =0; i<Shareholder.count; i++)
		{
			sh[i].attributeSalary();
		}
	}
	
	public void readTxt(File file, Object o)
	{
		try
		{
			//构造一个BufferedReader类来读取文件
			BufferedReader br = new BufferedReader(new FileReader(file));
			String LString[];
			String s = null;
			
			
			/*
			 * 从txt中逐行提取数据，然后存放在字符串s中，再用split（）函数拆开，经过合适类型转换后，
			 * 分别当作实参作为，构造函数的参数
			 */
			while((s = br.readLine()) != null) //利用readLine方法一次读取一行
			{
				LString = s.split("\\s+");
				
					if(Employee.class == o.getClass())
						e[Employee.count] = new Employee(LString[0], Integer.parseInt(LString[1]), LString[2]);
					else if(Manager.class == o.getClass())
						m[Manager.count] = new Manager(LString[0], Integer.parseInt(LString[1]), LString[2]
								,Integer.parseInt(LString[3]));
					else if(Shareholder.class == o.getClass())
					{
						
						sh[Shareholder.count] = new Shareholder(LString[0], Integer.parseInt(LString[1]), LString[2]
								,Float.parseFloat(LString[3]));
						//Shareholder.count 经过刚刚的构造函数调用，加了1，但是我们要用目前的这个，所以要减去1
						if(sh[Shareholder.count - 1] != null)
							sh[Shareholder.count - 1].setShare(profitSum);
					}
				
					
			}
			br.close();
		}
		catch(Exception e){
            e.printStackTrace();
        }
	}
	
	
	public int getprofitSum()
	{
		return profitSum;
	}
}
