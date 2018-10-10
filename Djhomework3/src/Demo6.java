import java.util.Random;

//数组元素逆序（代码实现）
public class Demo6 {
	public static void main(String[] args) {
		int i;
		int[] N = new int[10];           //定义一个10元素的数组
		Random r = new Random();          
		for (i = 0; i < N.length; i++) {    //随机生成10位数赋值给数组
			int a = r.nextInt(100);
			N[i] = a;
		}
		System.out.println("数组原顺序为");        //遍历正序打印数组
		for (i = 0; i < N.length; i++) {
			System.out.print(" " + N[i]);

		}
		System.out.println();                 
		System.out.println("数组逆序为");          //遍历逆序打印数组
		for (i = (N.length-1); i >= 0; i--) {
			System.out.print(" " + N[i]);
		}
	}
}

