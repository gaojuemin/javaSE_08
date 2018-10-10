import java.util.Scanner;

/*分析以下需求，并用代码实现：
	(1)键盘录入三个整数，按照从小到大的顺序输出
	(2)如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"

*/
public class Demo3 {
	public static void main(String[] args) {
		int N[] = new int[3];                 //定义一个3个元素的数组
		int temp;                             //中间过度暂存变量
		int i ;                               //循环变量
		int j ;
		System.out.println("请输入3个数");
		for (int a =0;a<3;a++) {                       //接收键盘输入三个数
			Scanner scanner = new Scanner(System.in);
			N[a] = scanner.nextInt();                 //赋值给数组N
		}
		for(i=0;i<N.length-1;i++) {                  //使用冒泡法排序
			for (j=0;j<N.length-1-i;j++ ) {
				if(N[j]>N[j+1]) {                    //原理如果N[1]比N[2]大，就把两数组值调换。
					temp = N[j];
					N[j]=N[j+1];
					N[j+1]=temp;
				}
			}
				}
		
		System.out.print("按照从小到大排序后的顺序为：");
		for (int a =0;a<3;a++) {
		System.out.print(" "+N[a]);}

	}
	
}
