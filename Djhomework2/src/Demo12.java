import java.util.Random;
import java.util.Scanner;

/*12.����
	* ����¼��x��ֵ�������y�Ĳ������		
	* x>=3	y = 2 * x + 1;
	* -1<x<3	y = 2 * x;
	* x<=-1	y = 2 * x - 1;
	*/
public class Demo12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input X"); 
		double x = scanner.nextDouble(); //���ռ�������
		double y;                         
		System.out.println("x=" + x);    //��X��С�����˳�������������������㡣
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
