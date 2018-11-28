package getluck;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GetPrize implements Runnable { //抽奖类，模拟抽奖。
	Object lock = new Object();
	int[] arr = { 5, 10, 20, 50, 100, 200, 500, 800, 1000,1500,2000,5000}; //奖池
	
	int i = arr.length - 1;
	
	public void run() {

		// 线程模拟开奖
		while (true) {
			synchronized (lock) {
				if (i >= 0) {
					// 模拟入场的操作
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Random r = new Random();
					int k = r.nextInt(100);      //随机选取员工，模拟抽奖。
					System.out.println(Thread.currentThread().getName() + "抽出一个:" + arr[i] + "元大奖");
					System.out.println("得到的人是" + Eenter.allin1[k][0] + "中奖彩票号为" + Eenter.allin1[k][1]);
					i--;
				}
			}
		}

	}

	
}
