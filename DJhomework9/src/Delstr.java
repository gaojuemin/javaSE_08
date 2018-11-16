import java.nio.Buffer;
import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)定义一个方法
		public Object[] deleteSubString(String str1,String str2) {
	
		}
	(3)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
		* 该数组的第一个元素为删除所有的str2后的最终的字符串
		* 该数组的第二个元素为删除的str2的个数		
 */
public class Delstr {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();         //建一个字符串buffer
		while (true) {               //循环接收键盘输入
			Scanner scan = new Scanner(System.in);      
			String str1 = scan.next();
			if (str1.equalsIgnoreCase("end")) {   //当输入end循环结束
				break;
			} else if (true) {            //不是and就继续接收输入并添加道str里
				str = str.append(str1);
				continue;
			}
		}

		System.out.println("输入的数据为：" + str);
		System.out.println("----------------------需求二");
		String str11 = "hello java , i like java ,java is great";  
		String str22 = "java";
		System.out.println(str11);
		System.out.println(str22);
		
		for (Object element:deleteSubString(str11, str22)) {  //调用方法打印结果
			System.out.println(element);
		}   
 			}
	

	public static Object[] deleteSubString(String str1, String str2) {
		String [] str33 = new String[2];       //设置返回数组
		StringBuffer sb1 = new StringBuffer();  //把str1转成StringBuffer
		sb1.append(str1);
		int c = 0;        
		int i = 0;
		while (sb1.indexOf(str2)>0) { //查找并删除指定字符 ，c是计数器，i是index
			i = sb1.indexOf(str2);
			sb1 = sb1.delete(i,i+str2.length());
			c++;
		}
		String c1=c+""; //c转成字符串，不然int型不能放入字符串数组
		String str3 = new String(sb1); //StringBuffer转回string
		str33[0] = str3; //填充数组内容。
		str33[1] = c1;
		return str33;

	}
}
