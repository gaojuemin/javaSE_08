package matrixzerose;

import java.util.Scanner;

public class Matrixzerose3 {
	public static void main (String[] args) {
		int i = 0;  								//定义一个整数i
		System.out.println("请输入一个3位正整数");		//提示输入数据
		Scanner scan = new Scanner (System.in); 	//接收键盘输入数据
		if (scan.hasNextInt()) {					//判断数据为有效数据，三位数判断标准													
			i = scan.nextInt();                     //是整数并且大于等于100小于1000	
			if ((i < 1000)&(i >= 100)) {
				String t = String.valueOf(i);       //把整数类型转换成字符串类型
				System.out.println("数字"+ i + "的个位是" + t.charAt(2) + ",十位是" + t.charAt(1) + ",百位是" + t.charAt(0));	
				}          //输出字符串各位数值
			else System.out.println("您输入的不是3位正整数");
		}
		else System.out.println("您输入的数据不正确");
	}
}






