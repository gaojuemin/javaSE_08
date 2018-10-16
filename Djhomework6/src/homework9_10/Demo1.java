
/*1. 请设计一个类Demo，这个类包含如下操作：
A:求两个数的和。
B:判断两个数是否相等。
C:输出九九乘法表。

最后在测试类Test中进行测试。
*/

package homework9_10;

public class Demo1 {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

	public void same(int a, int b) {
		if (a == b) {
			System.out.println(a + "等于" + b);
		} else
			System.out.println(a + "不等于" + b);
	}

	public void show9() {
		int x;
		for (int i = 9; i > 0; i--) {
			for (int j = 9; j >= i; j--) {
				x = i * j;
				System.out.print(i + "*" + j + "=" + x + " ");
			}
			System.out.println();
		}
	}

}
