import java.util.Random;
import java.util.Scanner;

//数组元素查找(查找指定元素第一次在数组中出现的索引)
public class Demo8 {
	public static void main(String[] args) {
		int i;
		int[] N = new int[30]; // 定义一个30个元素的数组,基本保证肯定可以查到数
		Random r = new Random(); // 用10以内随机数给数组赋值
		for (i = 0; i < N.length; i++) {
			int a = r.nextInt(10);
			N[i] = a;
		}
		System.out.println("请输入数字0-9，查询在数组中第一次出现的索引序号"); // 接收查询码0-9
		Scanner sca = new Scanner(System.in);
		int ask = sca.nextInt();
		System.out.println("得到的数组为"); // 输出随机获得的数组
		for (i = 0; i < N.length; i++) {
			System.out.print(" " + N[i]);
		}
		System.out.println();
		for (i = 0; i < N.length; i++) {
			if (N[i] == ask) {
				System.out.print("数组中第一次出现的索引序号为" + i);
				break;
			}

		}
	}
}
