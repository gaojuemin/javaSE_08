/*
 * 6.关于String类的练习题，分析运行结果？
	public class Test01 {	
		public static void main(String[] args) {
			//demo1();
			//demo2();
			//demo3();
			//demo4();
			demo5();
		}
		private static void demo5() {
			String s1 = "ab";
			String s2 = "abc";
			String s3 = s1 + "c";
			System.out.println(s3 == s2);
			System.out.println(s3.equals(s2)); 		
		}
		private static void demo4() {
			//byte b = 3 + 4;						
			String s1 = "a" + "b" + "c";
			String s2 = "abc";
			System.out.println(s1 == s2); 				
			System.out.println(s1.equals(s2)); 		
		}
		private static void demo3() {//==比较的是地址值
			String s1 = new String("abc");					
			String s2 = "abc";						
			System.out.println(s1 == s2); 			
			System.out.println(s1.equals(s2)); 		
		}
		private static void demo2() {
			//创建几个对象
			//创建两个对象,一个在常量池中,一个在堆内存中
			String s1 = new String("abc");		
			System.out.println(s1);
		}
		private static void demo1() {				
			String s1 = "abc";
			String s2 = "abc";
			System.out.println(s1 == s2); 				
			System.out.println(s1.equals(s2)); 		
		}
	}
 */
public class yunxjieguo {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		demo5();//?????
	}
	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2)); 		
	}
	private static void demo4() {
		//byte b = 3 + 4;						
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2); 				
		System.out.println(s1.equals(s2)); 		
	}
	private static void demo3() {//==比较的是地址值
		String s1 = new String("abc");					
		String s2 = "abc";						
		System.out.println(s1 == s2); 			
		System.out.println(s1.equals(s2)); 		
	}
	private static void demo2() {
		//创建几个对象
		//创建两个对象,一个在常量池中,一个在堆内存中
		String s1 = new String("abc");		
		System.out.println(s1);
	}
	private static void demo1() {				
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 				
		System.out.println(s1.equals(s2)); 		
	}

}
