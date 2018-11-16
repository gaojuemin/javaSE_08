import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
		举例:
			键盘录入：Hello12345World
			输出结果：hELLO*****wORLD
					  总共10个字母
 */
public class Xinghao {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(); // 建一个字符串buffer
		while (true) { // 循环接收键盘输入
			Scanner scan = new Scanner(System.in);
			String str1 = scan.next();
			if (str1.equalsIgnoreCase("end")) { // 当输入end循环结束
				break;
			} else if (true) { // 不是and就继续接收输入并添加道str里
				str = str.append(str1);
				continue;
			}
		}
		System.out.println("输入的数据为：" + str);
		System.out.print("转换后的数据为：");
		String str1 = new String(str); // stringbuffer转string
		char[] arr = str1.toCharArray();// string转char数组
		for (int i = 0; i < arr.length; i++) { // 一个一个字符判断，如果是大写转成小写，并打印，
			if (Character.isUpperCase(arr[i])) {//如果是小写转成大写，并打印，如果是其他变成*
				arr[i] = Character.toLowerCase(arr[i]);
				System.out.print(arr[i]);
			} else if (Character.isLowerCase(arr[i])) {
				arr[i] = Character.toUpperCase(arr[i]);
				System.out.print(arr[i]);
			} else if (true) {
				System.out.print("*");
			}
		}
	}
}
