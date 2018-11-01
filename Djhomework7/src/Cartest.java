/*9 描述：汽车都具有跑的功能，普通的奥迪车也不例外，但是高端的奥迪车除了具有跑的功能外，
 * 还具有自动泊车和无人驾驶的功能！
	需求：定义普通奥迪车，高端奥迪车，实现描述中的功能并测试
*/
class car { // 定义car父类
	public void run() {
		System.out.println("it can run");
	}
}

class audi extends car { // 定义普通奥迪
	public void run() {
		System.out.println("audi can run");
	}
}

class hi_audi extends car { // 定义高级奥迪
	public void run() {
		System.out.println("hi_audi can run");
	}

	public void autosotp() {
		System.out.println("hi_audi can auto stop");
	}

	public void autorun() {
		System.out.println("hi_audi can autorun");
	}
}

public class Cartest {
	public static void main(String[] args) {
		audi carA = new audi();
		hi_audi carB = new hi_audi();
		carA.run();
		System.out.println("----------");
		carB.run();
		carB.autorun();
		carB.autosotp();

	}

}
