public class Index_Address {

	public static void main(String[] args) 
	{
		int[] test = {1,2,3,4,5,6};
		
		// ����Խ��洢������
		/*System.out.println(test[6]); ERROR
		test[6] = 7; ERROR
		System.out.println(test[6]); ERROR  */ 
		//out of index �� can not visit
		
		
		
		
		//��ַ��ӡ
		//��ӡ�ĸ�ʽ�� getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		//--- toString(); equals(); hashCode() ֻ�����ڶ���ĵ�ַ���������ڴ�ӡ�����������͵ĵ�ַ
		
		System.out.println(test);
		System.out.println(test.toString());
		System.out.println(test.hashCode());
		System.out.println(  Integer.toHexString(test.hashCode()) );
		
		System.out.println();
		
		String[] test1 = {"a", "b", "c"};
		System.out.println(test1);
		System.out.println(test1.toString());
		System.out.println(test1.hashCode());
		System.out.println(  Integer.toHexString(test1.hashCode()) );
		
	}

}
