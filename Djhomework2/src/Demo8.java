//8.��д���򣬴�ӡ1��100֮�ڵ��������������а���7��Ҫ����
public class Demo8 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 100; i++) {     //��ӡ1-100����
			if ((i - 7 == 0) | ((i - 7) % 10) == 0) //�ж������λ��7������
				continue;
			else
				System.out.println(i);
		}
	}
}
