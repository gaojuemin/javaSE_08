
//��д��������5��1��10֮����������������ӡ���������̨��
import java.util.Random;

public class Demo6 {
	public static void main(String[] args) {
		// ����Random���ʵ��
		Random r = new Random();
		int j = 0;
		for (j = 1; j <= 5; j++) { // ��ӡ5����ѭ��5�Ρ�
			// �õ�0-10(������10)��Χ�ڵ���������������������������ֵ��i����
			int i = r.nextInt(10);
			System.out.println(i);
		}
	}

}
