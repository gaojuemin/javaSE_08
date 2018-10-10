import java.util.Scanner;
/*编写代码实现如下内容：if语句实现考试成绩分等级(使用switch语句)。
	[90-100]	A等。
	[80-90) 	B等。
	[70-80) 	C等。
	[60-70) 	D等。
	[0-60)  	E等。
	请根据给定成绩，输出对应的等级。
	说明："["表示包含，")"表示不包含
*/
public class Demo1 {
	public static void main(String agrs[]) {
		char l = 0;                             //定义成绩等级
		int i;                                  //i为成绩
		System.out.println("请输入你的成绩");		//提示输入成绩
		Scanner sco = new Scanner (System.in); 	//接收键盘输入
		i = sco.nextInt();                        //成绩赋值给i
		if ((90<=i)&(i <100)){                      //开始判断成绩的等级
			l = 'a';			
		}
		else if ((80<=i)&(i <90)){
			l = 'b';			
		}
		else if ((70<=i)&(i <80)){
			l = 'c';			
		}
		else if ((60<=i)&(i <70)){
			l = 'd';			
		}
		else if ((0<=i)&(i <60)){
			l = 'e';			
		}
		else System.out.println("你没有成绩");
		                                      //开始打印等级。
		switch (l) {                               
		case 'a':
			System.out.println("你的成绩是A等");
			break;
		case 'b':
			System.out.println("你的成绩是B等");
			break;
		case 'c':
			System.out.println("你的成绩是C等");
			break;
		case 'd':
			System.out.println("你的成绩是D等");
			break;
		case 'e':
			System.out.println("你的成绩是E等");
			break;
		}
	}

}
