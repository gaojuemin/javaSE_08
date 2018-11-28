package getluck;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Eenter implements Runnable {   //模拟入场并分发彩票。
	Object lock = new Object();
	public static gett allin = new gett(); 
	public static String [][] allin1 = allin.gett();  //得到员工与彩票联系的列表。
	public static int ca=0;
	public static int cb=0;
	int i = 99;
	public void run() {
				// 线程模拟入场,及发彩票
		while (true) {
			synchronized (lock) {
			if (i >= 0) {
				// 模拟入场的操作
				try {
					Thread.sleep(60);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(allin1[i][0] + "正在从" + Thread.currentThread().getName() + "入场:");
				System.out.println(allin1[i][0] + "得到彩票号码是" + allin1[i][1]); 
				i--;
				if (Thread.currentThread().getName()=="前门") {
					ca++;
				}
				if (Thread.currentThread().getName()=="后门") {
					cb++;
				}
				
			   }
			}
		}
	
	}
}
