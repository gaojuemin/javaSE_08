import java.util.Calendar;

/*
 * 课堂中的案例
 * 求出今天距离2020年1月1日还有多少天
 * 求出自己已经出生多少天
 * //获取时间中的天数
 */
public class KeTangDemo {
	public static void main(String[] args) {
		long currentTime = System.currentTimeMillis();
		int currentDay = (int) (currentTime/1000/60/60/24);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1980);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.DATE, 15);
		long birthTime = c.getTimeInMillis();
		int birthDay = (int) (birthTime/1000/60/60/24);
		System.out.print("出生");
		System.out.print(currentDay-birthDay);
		System.out.print("天");
		System.out.println("");
		Calendar d = Calendar.getInstance();
		d.set(Calendar.YEAR, 2020);
		d.set(Calendar.MONTH, 1);
		d.set(Calendar.DATE, 1);
		long dTime = d.getTimeInMillis();
		int dday = (int) (dTime/1000/60/60/24);
		System.out.print("今天距离2020年1月1日还有");
		System.out.print(dday-currentDay);
		System.out.print("天");
		}

	}

