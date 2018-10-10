
//打印等腰三角形
public class Demo4 {
	public static void main(String args[]) {
		for (int a = 0; a < 10; a++) {
			for (int b = 10; b > a; b--) {
				System.out.print(" ");
			}
			for (int b = 1; b < a * 1; b++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
