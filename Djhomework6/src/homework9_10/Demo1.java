
/*1. �����һ����Demo�������������²�����
A:���������ĺ͡�
B:�ж��������Ƿ���ȡ�
C:����žų˷���

����ڲ�����Test�н��в��ԡ�
*/

package homework9_10;

public class Demo1 {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

	public void same(int a, int b) {
		if (a == b) {
			System.out.println(a + "����" + b);
		} else
			System.out.println(a + "������" + b);
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
