package homework.Class;

import java.io.File;

public class CompanyControl {

	public static void main(String[] args) 
	{
		
		Company c = new Company();
		c.setEGift("Сƻ��");
		c.setMGift("��ƻ��");
		c.readTxt(new File("C:\\Users\\����\\Desktop\\��˾�ַ�������Ŀ\\��˾��Ա����\\employee.txt"), new Employee());
		c.readTxt(new File("C:\\Users\\����\\Desktop\\��˾�ַ�������Ŀ\\��˾��Ա����\\manager.txt"), new Manager());
		c.readTxt(new File("C:\\Users\\����\\Desktop\\��˾�ַ�������Ŀ\\��˾��Ա����\\shareHolder.txt"), new Shareholder());
		c.distribute();
		

	}

}
