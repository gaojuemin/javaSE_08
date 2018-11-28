package getluck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryTicket {     //彩票生成类。生成一张双色球彩票。
	public LotteryTicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List LotteryTicket() {
		Random r = new Random();
		ArrayList<Integer> ticket = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			ticket.add(r.nextInt(32) + 1); // 随机生成双色球红色部分(1-33)
			// 取六位生成一个数组。
		}
		ticket.add(6, (r.nextInt(15) + 1));   //添加最后一位蓝色部分，1-16，
		// 生成一张正式双色球彩票，用t数组表示。
		
		return ticket;
	}
}
