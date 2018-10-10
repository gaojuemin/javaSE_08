import java.util.Scanner;

/*分析以下需求，并用代码实现：
	(1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
	(2)涨工资的条件如下：
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	(3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，
	基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
 */
 
public class Demo2 {
	public static void main(String[] args) {
		int age = 0;         //定义工龄
		int sa = 0;          //定义工资
		int addsa = 0;       //应涨工资
		int fsa = 0;       //定义涨后工资
		System.out.println("请输入你的工龄");
		Scanner scanner1 = new Scanner(System.in);
		age = scanner1.nextInt();
		System.out.println("请输入你的工资");
		Scanner scanner2 = new Scanner(System.in);
		sa = scanner2.nextInt();
		if ((10<=age)&(age<15)){                      //判断工龄
			addsa = 5000;                             //加工资的多少
			fsa = sa + addsa;                         //加后工资多少
			System.out.println("您目前工作了"+age+"年,基本工资为"+sa+"元,应涨工资"+addsa+"元,涨后工资 "+fsa+"元");
		}
		else if ((5<=age)&(age<10)){
			addsa = 2500;
			fsa = sa + addsa;
			System.out.println("您目前工作了"+age+"年,基本工资为"+sa+"元,应涨工资"+addsa+"元,涨后工资 "+fsa+"元");			
		}
		else if ((3<=age)&(age<5)){
			addsa = 1000;
			fsa = sa + addsa;
			System.out.println("您目前工作了"+age+"年,基本工资为"+sa+"元,应涨工资"+addsa+"元,涨后工资 "+fsa+"元");			
		}
		else if ((1<=age)&(age<3)){
			addsa = 500;
			fsa = sa + addsa;
			System.out.println("您目前工作了"+age+"年,基本工资为"+sa+"元,应涨工资"+addsa+"元,涨后工资 "+fsa+"元");
		}
		else if ((0<=age)&(age<1)){
			addsa = 200;
			fsa = sa + addsa;			
		}
		else System.out.println("您输入错误");
	}

}
