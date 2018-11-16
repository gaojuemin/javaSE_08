import java.util.Scanner;

/*1.用代码演示String类中的以下方法的用法
	(1)boolean isEmpty(): 判断字符串是不是空串,如果是空的就返回true
	(2)char charAt(int index): 返回索引上的字符
	(3)String toLowerCase(): 字符串转成小写
	(4)String toUpperCase(): 字符串转成大写
	(5)String repalce(char oldChar, char newChar): 将字符串中的老字符,替换为新字符
	(6)String repalce(String old, String newstr): 将字符串中的老字符串,替换为新字符串
	(7)String trim(): 去掉字符串两端空格
*/
public class Stringdemo {
	public static String str;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("接收字符串：");
		if (scan.hasNextLine()) {
			str = scan.nextLine();
		}
		scan.close();
		System.out.println("输入的数据为：" + str);
		System.out.println("--------------------------");
		System.out.println("判断字符串是否为空串");
		boolean a = str.isEmpty();
		if (a==true) {
			System.out.println("字符串是空串");
		}
		else {
			System.out.println("字符串不是空串");
		}
		System.out.println("--------------------------");
		System.out.println("字符串第二位字符是：" + str.charAt(1));
		System.out.println("--------------------------");
		System.out.println("字符小写：" + str.toLowerCase());
		System.out.println("--------------------------");
		System.out.println("字符大写：" + str.toUpperCase());
		System.out.println("--------------------------");
		System.out.println("字符a换成b：" + str.replace("a","b"));
		System.out.println("--------------------------");
		System.out.println("字符串abc换成cba：" + str.replace("abc","cba"));
		System.out.println("--------------------------");
		System.out.println("去除两端空格：" + str.trim());
	}
}
