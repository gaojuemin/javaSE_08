import java.util.Random;

//����Ԫ�����򣨴���ʵ�֣�
public class Demo6 {
	public static void main(String[] args) {
		int i;
		int[] N = new int[10];           //����һ��10Ԫ�ص�����
		Random r = new Random();          
		for (i = 0; i < N.length; i++) {    //�������10λ����ֵ������
			int a = r.nextInt(100);
			N[i] = a;
		}
		System.out.println("����ԭ˳��Ϊ");        //���������ӡ����
		for (i = 0; i < N.length; i++) {
			System.out.print(" " + N[i]);

		}
		System.out.println();                 
		System.out.println("��������Ϊ");          //���������ӡ����
		for (i = (N.length-1); i >= 0; i--) {
			System.out.print(" " + N[i]);
		}
	}
}

