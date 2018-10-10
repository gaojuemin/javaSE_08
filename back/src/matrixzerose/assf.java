package matrixzerose;

//用“埃氏筛法”求2～10000以内的素数。2～10000以内的数，先去掉2的倍数，再去掉3的倍数，再去掉4的倍数，……依此类推，最后剩下的就是素数。
public class assf {
	public static void main(String[] args) {
		int arr[] = new int[10001];
		for (int i = 0; i < arr.length; i++) {    //建立一个数组并给数组赋值范围0-10000，数组是要被筛选的对象
			arr[i] = i;
		}
		System.out.println("原来数列Original series");           //打印未筛选的数列
		for (int x : arr) {
			System.out.println(arr[x]+" ");
		}
		System.out.println();
           //去掉2的倍数，再去掉3的倍数，再去掉4的倍数。。。。。。。
		for (int j = 2; j < arr.length; j++) {       //判断数组中哪些数是某个数的倍数
			for (int i = 2; i < arr.length; i++) {          // 例如 arr[4]是4，用2-10000的数去整除4
				if ((i % arr[j] == 0) && (arr[j] != i)) {   //如果能整除则把对应的arr数设为10002，
					arr[i] = 10002;                        //因为10002这个数肯定不能被整除。
				} else
					continue;
			}
		}
		System.out.println("筛选后质数列Filtered series");
		
		for (int j = 2; j < arr.length; j++) {
			if (arr[j] != 10002) {
				System.out.println(arr[j]);
			}

		}
	}
}
