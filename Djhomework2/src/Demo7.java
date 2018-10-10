//7.计算1-100之间的质数有多少个？将质数以及质数总数打印在控制台。
public class Demo7 {
	public static void main (String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {   //判断2-100其中哪些是素数，1不是素数除外。 
			if (prime(i)) {               //把需要判断的数送入判段函数进行判断。
				System.out.println(i);   //如果是就打印。
				count++;                 //count为有多少素数的计数器，有一个数就自加1.
				}
			}
		System.out.println("total prime is "+count);	
			
		}

//以下程序段判断传入的数num是不是素数，如果是就返回true				
public static boolean prime(int num){
	for(int i=2;i<num;i++) {     //判断标准是只能被1和被自己整除的整数为素数。
		if (num%i==0) {          //判断num是不是素数，用num把比num小的数挨个除一遍
			return false;
		}
	}
	return true;
}

}