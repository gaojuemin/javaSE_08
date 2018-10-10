package matrixzerose;

import java.util.Scanner;
import java.util.Random;
	
public class Matrixzerose4 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a number");
		int number = scanner.nextInt();
		System.out.println(number);
		Random random = new Random();
		int i = random.nextInt(100);
		double  d = random.nextDouble()*1000;
		System.out.println(i);
		System.out.println(d);
	}
}






