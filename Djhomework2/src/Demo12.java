import java.util.Random;
import java.util.Scanner;

/*12.需求：
	* 键盘录入x的值，计算出y的并输出。		
	* x>=3	y = 2 * x + 1;
	* -1<x<3	y = 2 * x;
	* x<=-1	y = 2 * x - 1;
	*/
public class Demo12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input X"); 
		double x = scanner.nextDouble(); //接收键盘输入
		double y;                         
		System.out.println("x=" + x);    //按X由小到大的顺序设置条件并进行运算。
		if (x <= -1) {
			y = y = 2 * x - 1;
			System.out.println("y=" + y);
		} else if (x < 3) {
			y = 2 * x;
			System.out.println("y=" + y);
		} else {
			y = 2 * x + 1;
			System.out.println("y=" + y);
		}
	}
}
