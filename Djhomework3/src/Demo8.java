import java.util.Random;
import java.util.Scanner;

//����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
public class Demo8 {
	public static void main(String[] args) {
		int i;
		int[] N = new int[30]; // ����һ��30��Ԫ�ص�����,������֤�϶����Բ鵽��
		Random r = new Random(); // ��10��������������鸳ֵ
		for (i = 0; i < N.length; i++) {
			int a = r.nextInt(10);
			N[i] = a;
		}
		System.out.println("����������0-9����ѯ�������е�һ�γ��ֵ��������"); // ���ղ�ѯ��0-9
		Scanner sca = new Scanner(System.in);
		int ask = sca.nextInt();
		System.out.println("�õ�������Ϊ"); // ��������õ�����
		for (i = 0; i < N.length; i++) {
			System.out.print(" " + N[i]);
		}
		System.out.println();
		for (i = 0; i < N.length; i++) {
			if (N[i] == ask) {
				System.out.print("�����е�һ�γ��ֵ��������Ϊ" + i);
				break;
			}

		}
	}
}
