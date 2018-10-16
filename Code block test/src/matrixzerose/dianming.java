//存储姓名
	//总览姓名
	//随机点名
package matrixzerose;

import java.util.Random;

public class dianming {
	public static void main(String[] agrs) {
		savename ();
		String []classa = savename();
		showname (classa);
		dianmin (classa);
		
	}
	public static String[] savenam3() {
		String []a1 = {"123"};
		return a1;
	}

	public static String[] savename () {
		
		return new String []{"A","B","C","D","E","F","G"};//为什么不能写
		//rteturn {"A","B","C","D","E","F","G"};
	}
	
	public static void showname(String []a) {
		System.out.println("同学姓名为");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void  dianmin (String []name) {
		Random r =new Random();
		int x = r.nextInt(name.length);
		System.out.print("被点姓名为"+name[x]);
		
	}
		
	
}
	
	