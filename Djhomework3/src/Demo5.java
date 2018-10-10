import java.util.Random;

/*
 * 数组获取最值(获取数组中的最大值最小值)（代码实现）
 */
public class Demo5 {
	public static void main(String[] args) {
		int i, j, temp;
		int[] N = new int[10];              //定义一个10个元素的数组
		Random r = new Random();            //用100以内随机数给数组赋值
		for (i = 0; i < N.length; i++) {
			int a = r.nextInt(100);
			N[i] = a;
		}
		System.out.println("随机得到的数组为");        //输出随机获得的数组
		for (i = 0; i < N.length; i++) {
			System.out.print(" " + N[i]);
		}
		for (i = 0; i < N.length - 1; i++) { // 使用冒泡法排序
			for (j = 0; j < N.length - 1 - i; j++) {
				if (N[j] > N[j + 1]) { 
					temp = N[j];
					N[j] = N[j + 1];
					N[j + 1] = temp;
				}
			}
		}
		                                      //输出数组的第一个和最后一个，就是最大值和最小值
		System.out.println();
		System.out.println("数组最大值" + N[N.length - 1]);
		System.out.println("数组最小值" + N[0]);

	}
}
