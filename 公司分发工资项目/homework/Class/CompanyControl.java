package homework.Class;

import java.io.File;

public class CompanyControl {

	public static void main(String[] args) 
	{
		
		Company c = new Company();
		c.setEGift("小苹果");
		c.setMGift("大苹果");
		c.readTxt(new File("C:\\Users\\彭湃\\Desktop\\公司分发工资项目\\公司成员数据\\employee.txt"), new Employee());
		c.readTxt(new File("C:\\Users\\彭湃\\Desktop\\公司分发工资项目\\公司成员数据\\manager.txt"), new Manager());
		c.readTxt(new File("C:\\Users\\彭湃\\Desktop\\公司分发工资项目\\公司成员数据\\shareHolder.txt"), new Shareholder());
		c.distribute();
		

	}

}
