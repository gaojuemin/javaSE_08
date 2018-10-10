import java.util.Scanner;

//13.键盘录入三个整数，并将三个数据中的最大值打印在控制台。
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input x"); 
		int x = sc.nextInt();                 //接收键入的数字
		System.out.println("please input y");
		int y = sc.nextInt();
		System.out.println("please input z");
		int z = sc.nextInt();
		if ((x>y)&&(x>z)){                    //开始对比哪个数是最大的
			System.out.println("the biggest number is "+x); 
		}
		else if ((y>x)&&(y>z)){
			System.out.println("the biggest number is "+y);
		}
		else if ((z>x)&&(z>y)){
			System.out.println("the biggest number is "+z);
		}
		else System.out.println("the biggest number is not only one");
	}
}
