package homework.Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Company 
{
	public static int MAX_EMPLOYEE_NUMBER = 100;
	public static int MAX_MANAGER_NUMBER = 10;
	public static int MAX_SHAREHOLDER_NUMBER = 10;
	
	private int profitSum = 0; //��˾�������ܺ�
	private Employee[] e; //��˾��ְԱ����
	private Manager[]  m; //��˾�ľ�����
	private	Shareholder[] sh; //��˾�Ĺɶ�����
	private String EGift;  //��˾�ַ�Ա������
	private String MGift;	//��˾�ַ���������
	
	/*
	 * ��˾�ĸ���ְԱ�ļ��ϴ�С��ʼ��
	 * ��˾��������Ĵ�ʹ��
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
	 * �����ʵĴ�ʹ��
	 * ע��employee�����������������Ĺ�ϵ
	 * 
	 */
	public void distribute()
	{
		/*
		 * manager��Shareholder��������ʱ�������ְԱ���캯��������ְԱ��static ���������仯��
		 * ����ͨ���������Ҳ���յ�Ӱ��
		 * 
		 * ������鸳ֵ��new�õĴ�С����ô����ֱ�� �� for(class c : C[])����Ϊ����û��ʼ���ĳ�Ա
		 * ͬ�������.lengthҲ�ǣ������ܴ�С�������������Ѿ���ʼ���Ĵ�С
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
			//����һ��BufferedReader������ȡ�ļ�
			BufferedReader br = new BufferedReader(new FileReader(file));
			String LString[];
			String s = null;
			
			
			/*
			 * ��txt��������ȡ���ݣ�Ȼ�������ַ���s�У�����split���������𿪣�������������ת����
			 * �ֱ���ʵ����Ϊ�����캯���Ĳ���
			 */
			while((s = br.readLine()) != null) //����readLine����һ�ζ�ȡһ��
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
						//Shareholder.count �����ոյĹ��캯�����ã�����1����������Ҫ��Ŀǰ�����������Ҫ��ȥ1
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
