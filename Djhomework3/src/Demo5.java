import java.util.Random;

/*
 * �����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)������ʵ�֣�
 */
public class Demo5 {
	public static void main(String[] args) {
		int i, j, temp;
		int[] N = new int[10];              //����һ��10��Ԫ�ص�����
		Random r = new Random();            //��100��������������鸳ֵ
		for (i = 0; i < N.length; i++) {
			int a = r.nextInt(100);
			N[i] = a;
		}
		System.out.println("����õ�������Ϊ");        //��������õ�����
		for (i = 0; i < N.length; i++) {
			System.out.print(" " + N[i]);
		}
		for (i = 0; i < N.length - 1; i++) { // ʹ��ð�ݷ�����
			for (j = 0; j < N.length - 1 - i; j++) {
				if (N[j] > N[j + 1]) { 
					temp = N[j];
					N[j] = N[j + 1];
					N[j + 1] = temp;
				}
			}
		}
		                                      //�������ĵ�һ�������һ�����������ֵ����Сֵ
		System.out.println();
		System.out.println("�������ֵ" + N[N.length - 1]);
		System.out.println("������Сֵ" + N[0]);

	}
}
