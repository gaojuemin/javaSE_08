package matrixzerose;

import java.util.Scanner;

public class Matrixzerose3 {
	public static void main (String[] args) {
		int i = 0;  								//����һ������i
		System.out.println("������һ��3λ������");		//��ʾ��������
		Scanner scan = new Scanner (System.in); 	//���ռ�����������
		if (scan.hasNextInt()) {					//�ж�����Ϊ��Ч���ݣ���λ���жϱ�׼													
			i = scan.nextInt();                     //���������Ҵ��ڵ���100С��1000	
			if ((i < 1000)&(i >= 100)) {
				String t = String.valueOf(i);       //����������ת�����ַ�������
				System.out.println("����"+ i + "�ĸ�λ��" + t.charAt(2) + ",ʮλ��" + t.charAt(1) + ",��λ��" + t.charAt(0));	
				}          //����ַ�����λ��ֵ
			else System.out.println("������Ĳ���3λ������");
		}
		else System.out.println("����������ݲ���ȷ");
	}
}






