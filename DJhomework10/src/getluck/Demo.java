package getluck;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//1、线程池的原理
//   线程池，其实就是一个容纳多个线程的容器，其中的线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源
//2、线程的生命周期(五中状态的切换流程)

    
//3、有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池用一个数组int[] arr = {10,5,20,50,100,200,500,800,2,80,300}; 
//	创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”，随机从arr数组中获取奖项元素并打印在控制台上,格式如下:
//	
//	抽奖箱1 又产生了一个 10 元大奖
//	抽奖箱2 又产生了一个 100 元大奖	
//	//.....
//4、某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,假设公司有100个员工,利用多线程模拟年会入场过程,
//	并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程运行后打印格式如下：
//	编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是: [17, 24, 29, 30, 31, 32, 07]
//	编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是: [06, 11, 14, 22, 29, 32, 15]
//	//.....
//	从后门入场的员工总共: 13 位员工
//	从前门入场的员工总共: 87 位员工

//两题和一起做了。
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		//进场线程开启
		Eenter enter = new Eenter();
		Thread t1= new Thread(enter,"前门");
		Thread t2 = new Thread(enter,"后门");
		t1.start();
		t2.start();
		//抽奖环节
		
		TimeUnit.MILLISECONDS.sleep(11000);
		System.out.println("从后门入场的员工总共:"+Eenter.ca);
		System.out.println("从前门入场的员工总共:"+Eenter.cb);
		System.out.println("------------下面是抽奖环节-----------------");
		GetPrize getp = new GetPrize();
		Thread k1= new Thread(getp,"抽奖箱A");
		Thread k2 = new Thread(getp,"抽奖箱B");
		
		k1.start();
		k2.start();
		
    	
	

		
		
		
	}
	

}
