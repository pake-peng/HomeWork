public class Test1
{
	private int bottleSum; //酒瓶子数
	
	public Test1()
	{
		bottleSum = 99;
	}
	
	public Test1(int aBottlesum)
	{
		if(aBottlesum < 0)
			System.out.println(" ERROR : the Bottles Sum < 0");
		    System.exit(-1);
		bottleSum = aBottlesum;
	}
	
	public static void printNursery(int aBottlesum)
	{
		if(aBottlesum == 1)
			System.out.println( aBottlesum + " bottle of beer on the wall,"
				+ aBottlesum + " bottle of beer.");
		else if(aBottlesum > 1)
			System.out.println( aBottlesum + " bottles of beer on the wall,"
				+ aBottlesum + " bottles of beer.");
		else
		{
			//ERROR Exit
			System.out.println(" ERROR : the Bottles Sum == 0");
			//System.exit(-1);
		}
			
		System.out.println("Take one down");
		System.out.println("Pass it around.");
		
		if(aBottlesum == 2)
			System.out.println( "1 bottle of beer on the wall");
		else if(aBottlesum == 1)
			System.out.println( "0 bottle of beer on the wall");
		else
			System.out.println( aBottlesum-1 + " bottles of beer on the wall");
	}
	
	public static void main(String[] args)
	{
		Test1 test = new Test1();
		int Bsum = test.bottleSum;
		while(Bsum > 0)
		{
			Test1.printNursery(Bsum);	
			--Bsum;
			System.out.println("");
		}
		
		//防止Bsum 为负数时，任然调用此程序
		//if(Bsum == 0)
		System.out.println("no more bottles of beer on the wall");
		
	}
}