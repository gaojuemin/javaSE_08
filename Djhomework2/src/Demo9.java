/*9.练习题(完善下面的代码)
 * for(int x=1; x<=10; x++) {
		if(x%3==0) {
			if (x / 3 == 1){
				break;
			}
		}
		System.out.println(“Java基础班”);
	}
	
	我想在控制台输出2次:“Java基础班“
	for (int x = 1; x <= 10; x++) {
			if (x % 3 == 0) {
				continue;
			}
			System.out.println("Java基础班");
		}
	我想在控制台输出7次:“Java基础班“
	
	我想在控制台输出13次:“Java基础班“
*/
public class Demo9 {
	public static void main (String[] args) {
	for (int x = 1; x <= 10; x++) {
		if (x % 3 == 0) {
			System.out.println("Java基础班");
		}
		System.out.println("Java基础班");
	}
	}
}
