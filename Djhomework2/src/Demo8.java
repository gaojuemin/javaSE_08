//8.编写程序，打印1到100之内的整数，但数字中包含7的要跳过
public class Demo8 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 100; i++) {     //打印1-100的数
			if ((i - 7 == 0) | ((i - 7) % 10) == 0) //判断如果个位是7就跳过
				continue;
			else
				System.out.println(i);
		}
	}
}
