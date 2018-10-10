import java.util.Scanner;

//数组查表法(根据键盘录入索引,查找对应星期)
public class Demo7 {
	public static void main(String[] args) {
		char week[] =  {'一','二','三','四','五','六','日'};  //建立数组存储星期几
		System.out.println("请输入数字1-7，查询对应的星期");   //接收查询码1-7
		Scanner sca = new Scanner(System.in);
		int ask = sca.nextInt();               
		if ((ask>7)|(ask<1)) {              //查询1-7对应的星期，如超出范围报错        
			System.out.println("您输入的查询码有误");
		}
		else System.out.println("您查询的是星期"+week[ask-1]);
	}
	
}
