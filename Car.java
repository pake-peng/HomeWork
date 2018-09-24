import java.util.Scanner;
import java.util.*;
/**
 * 
 * @author 彭湃
 * @version 1.0
 * 
 *  定义一个汽车类，采用数组方式，用户输入一组汽车的属性，然后再输出一组汽车的各个属性
 */
public class Car 
{
		//属性依次是 汽车名 油箱大小 油量 耗油量
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
			System.out.println("请依次输入汽车的汽车名 油箱大小 油量 耗油量");
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
				System.out.println("油箱已经满了");
				return false;
			}
			else if(oiltank + addOil >= oilLength)
			{
				oiltank = oilLength;
				System.out.println("邮箱不需要这么多油,这次加油只加了" + (oilLength - oiltank));
				return true;
			}
			oiltank += addOil;
			return true;
		}
		
		public boolean run()
		{
			if(oiltank == 0)
			{
				System.out.println("汽车没没油");
				return false;
			}
			else if(oiltank < oilConsumption)
			{
				System.out.println("汽车油不够行驶一公里");
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
