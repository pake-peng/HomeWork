import java.util.Scanner;
import java.util.*;
/**
 * 
 * @author ����
 * @version 1.0
 * 
 *  ����һ�������࣬�������鷽ʽ���û�����һ�����������ԣ�Ȼ�������һ�������ĸ�������
 */
public class Car 
{
		//���������� ������ �����С ���� ������
		private String name;
		private int oilLength;
		private int oiltank;
		private int oilConsumption;
		
		
		public Car()
		{
			name = "";
			oilLength = 0;
			oiltank = 0;
			oilConsumption = 0;
		}
		
		public Car(ArrayList<String> SArray)
		{
			if(SArray.get(0).equals("") && Integer.valueOf(SArray.get(1))>0 && 
					+ Integer.valueOf(SArray.get(2))>0)
			name = SArray.get(0);
			oilLength = Integer.valueOf(SArray.get(1));
			oilConsumption = Integer.valueOf(SArray.get(2));
			oiltank = 0;
		}
		
		public void SetAndPrint()
		{
			System.out.println("���������������������� �����С ���� ������");
			Scanner in = new Scanner(System.in);
			ArrayList<String> SArray = new ArrayList<>(20);
			while(in.hasNext())
				SArray.add(in.next());
			
			showProperty();
		}
		
		public void showProperty()
		{
			System.out.println("name: " + name + "oilLength: " + oilLength + "oiltank: " + oiltank 
					+ "oilConsumption: " +oilConsumption);
		}
		
		public boolean gasAdd(int addOil)
		{
			if(oiltank == oilLength)
			{
				System.out.println("�����Ѿ�����");
				return false;
			}
			else if(oiltank + addOil >= oilLength)
			{
				oiltank = oilLength;
				System.out.println("���䲻��Ҫ��ô����,��μ���ֻ����" + (oilLength - oiltank));
				return true;
			}
			oiltank += addOil;
			return true;
		}
		
		public boolean run()
		{
			if(oiltank == 0)
			{
				System.out.println("����ûû��");
				return false;
			}
			else if(oiltank < oilConsumption)
			{
				System.out.println("�����Ͳ�����ʻһ����");
				return false;
			}
			else
				return true;
				
		}
		
		public static void main(String[] args)
		{
			Car c1 = new Car();
			c1.SetAndPrint();
		}
}
