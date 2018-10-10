
//编写程序，生成5个1至10之间的随机整数，并打印结果到控制台。
import java.util.Random;

public class Demo6 {
	public static void main(String[] args) {
		// 创建Random类的实例
		Random r = new Random();
		int j = 0;
		for (j = 1; j <= 5; j++) { // 打印5个，循环5次。
			// 得到0-10(不包含10)范围内的随机整数，将产生的随机整数赋值给i变量
			int i = r.nextInt(10);
			System.out.println(i);
		}
	}

}
