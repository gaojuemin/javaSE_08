package getluck;

//模拟得到彩票
public class gett {
	public String[][] gett() { // 用二位数组模拟员工分发彩票，每个人得到一张彩票，第一维是员工名字，第二维是持有彩票号。
		String[][] hold = new String[100][2]; // 100员工数量
		LotteryTicket gett1 = new LotteryTicket();
		Staff st = new Staff();
		for (int i = 0; i < 100; i++) {
			st.setName(Integer.toString(i) + "号员工"); // 每个员工得到名字
			hold[i][0] = st.getName();
			hold[i][1] = gett1.LotteryTicket().toString();// 每个员工分发彩票
		}
		return hold;
	}
}
