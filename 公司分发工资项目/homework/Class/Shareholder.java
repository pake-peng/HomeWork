package homework.Class;


import java.util.Date;

public class Shareholder extends Employee
{

	private double share; //�ɷ�
	private int bouns; //Ӧ�÷ֺ�
	private  static double shareSum = 0.0 ; //������Źɶ��ܹɷݣ����ⳬ����1
	public static int count = 0; //�ɶ�����
	
	/**
	 * @param name
	 * @param salary
	 * @param birthday
	 * �ɹɷ��ܺ��Ƿ񳬹��ļ��
	 */
	public Shareholder(String name, int salary, String birthday, double share) 
	{
		super(name, salary, birthday);
		if(share >= 1.0)
		{
			System.out.println("�ɷ��Ѿ������ˣ�û�йɷݷ���");
			System.exit(-1);
		}
		if(share > 0 && share < 1.0)
		{
			this.share = share;
			shareSum += share;
			count++;
		}
		else
			System.out.println("�ɷ����������������");
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

	//�ֺ���ڹ�˾�������0.1�����ɷ�ƽ��
	public int setBouns(int profitYear) 
	{
		return (int)(profitYear * 0.1 * share);
	}

	public void attributeSalary()
	{
		System.out.println("�ɶ����� �� " + (super.getSalary() + getBouns()) );
		attribureShare();
	}
	
	public void attributeGift()
	{
		//�պ�������Ϊ�ɶ�û�й���
	}
	
	public void setShare(int profitSum)
	{
		bouns = (int)(profitSum * share);
	}
	
	public void attribureShare()
	{
		System.out.println("�ɶ��ֺ�Ϊ �� " + bouns);
	}
	
}
