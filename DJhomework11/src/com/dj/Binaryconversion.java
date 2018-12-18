package com.dj;

import java.util.ArrayList;
import java.util.Scanner;

//输入数m（32位整数），转换N进制（2<=n<=16)数。
public class Binaryconversion {
	 static int temp1;
	 static int yu1 = 0;
	 static int i1 =0;
	 static ArrayList<Integer> e1 = new ArrayList<Integer>();
	public static void main(String[] args) {
		System.out.println("输入要转换的数");
		Scanner sc = new Scanner(System.in); 
		int m = sc.nextInt();
		if (m<-2147483648||m>2147483647) {    
			System.out.println("M超出范围");
		}
		System.out.println("输入要转换的进制");
		int n = sc.nextInt();
		if (2>n||n>16) {
			System.out.println("n超出范围");
		}
		ArrayList a = conversion1(m,n);
		System.out.print("转换结果   ");
		
		for(int i=a.size()-1 ;i>=0;i--) {
			if((int)a.get(i)> 9) {
			int b =	(int)a.get(i)+55;   //数字转Ascii码转英文。
			char c = (char)b;
			System.out.print(c);
			}
			else {
			System.out.print(a.get(i));
		}
		}
		
		
	}
	//递归方法
//	public static int conversion(int m1,int n1) {
//		while (m1!=0) {
//		     temp1= m1/n1;    //数字转换成对应的数制。取商数和余数。
//		     yu1 = m1%n1;
//		     m1=temp1;
//		       
//	     	}
//		return e1;
//	}
	
	
	//传统方法
	public static ArrayList conversion1(int m,int n) {
		 int temp;
		 int yu = 0;
		 int i =0;
		 ArrayList<Integer> end = new ArrayList<Integer>();
		while (m!=0) {
		     temp= m/n;    //数字转换成对应的数制。取商数和余数。
		     yu = m%n;
		     m = temp;
		     end.add(yu);
	     	}
		return end;
		}
}
