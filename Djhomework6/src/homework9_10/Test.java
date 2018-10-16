/*

测试类
			*/

package homework9_10;

import homework9_10.*;

public class Test {
	public static void main(String[] args) {
		Demo1 test1 = new Demo1();  //新建测试对象
		test1.add(18, 9);           //调用类方法
		System.out.println();
		
		test1.same(6, 6);
		System.out.println();
		
		test1.show9();
		System.out.println();
		
		Developer deve = new Developer(); //测试developer类
		deve.setName("Developer");
		deve.setSN(123456);
		deve.setWage(5000);
		deve.work();
		
		Manager man = new Manager();     //测试manager类
		man.setName("Manage");
		man.setSN(654321);
		man.setWage(8000);
		man.setbonus(3000);
		man.work();
		
		student s = new student();
		s.setName("student");
		s.setage(18);
		s.act();
		s.sw1();
		
		teacher t = new teacher();
		t.setName("teacher");
		t.setage(50);
		t.act();
		t.sw2();
		
		cat c = new cat();
		c.setName("black");
		c.setlegnum(4);
		c.eat();
		c.ac1();
		
		dog d = new dog();
		d.setName("yellow");
		d.setlegnum(4);
		d.eat();
		d.ac2();
		
		
		
		
		
		

	}

}
