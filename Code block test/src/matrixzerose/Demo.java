package matrixzerose;

import java.util.Random;

public class Demo {
	public static void main(String[] args) { 
	double are = are (3.21,3.22,3.21);
	System.out.println(are);
	pr();
	int a=1,b=1;
	pr1(a,b);
	pr1(4,5);
	add (1,2);
	add (1,2,3);
	add(1.1,1.2);
	}



public static double are (double x,double y,double z) {
	//有参数，有返回
	return (x*y*z)/3;
}

public static void pr() {  //无参数无返回
	for (int i=0;i<4;i++) {
		for (int j =0 ;j<4;j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
}
public static void pr1(int m ,int n) {  //有参数无返回
	for (int i=0;i<m;i++) {
		for (int j =0 ;j<n;j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
}
public static int add (int x,int y) {
	return (x+y);
}
public static int add (int x,int y,int z) {
	return (x+y+z);
}
public static int add (double x,double y) {
	int a;
	a= (int) (x+y);
	return a;
}
}

