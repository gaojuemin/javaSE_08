//10.�ҹ����ɽ������������壬8848�ס���������һ���㹻���ֽ�����ĺ����0.01�ס����ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
public class Demo10 {
	public static void main(String[] args) {
		double i = 0.01; // ֽ���
		int count = 0; // �۵�����
		while (i <= 8848) { // ��֪ѭ��������while�ж�
			i = i * 2; // ��һ����ԭ��������
			count = count + 1;
		}
		System.out.println("���۵�" + (count - 1) + "�Σ������۳����������ĸ߶�");
	}
}
