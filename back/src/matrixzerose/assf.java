package matrixzerose;

//�á�����ɸ������2��10000���ڵ�������2��10000���ڵ�������ȥ��2�ı�������ȥ��3�ı�������ȥ��4�ı����������������ƣ����ʣ�µľ���������
public class assf {
	public static void main(String[] args) {
		int arr[] = new int[10001];
		for (int i = 0; i < arr.length; i++) {    //����һ�����鲢�����鸳ֵ��Χ0-10000��������Ҫ��ɸѡ�Ķ���
			arr[i] = i;
		}
		System.out.println("ԭ������Original series");           //��ӡδɸѡ������
		for (int x : arr) {
			System.out.println(arr[x]+" ");
		}
		System.out.println();
           //ȥ��2�ı�������ȥ��3�ı�������ȥ��4�ı�����������������
		for (int j = 2; j < arr.length; j++) {       //�ж���������Щ����ĳ�����ı���
			for (int i = 2; i < arr.length; i++) {          // ���� arr[4]��4����2-10000����ȥ����4
				if ((i % arr[j] == 0) && (arr[j] != i)) {   //�����������Ѷ�Ӧ��arr����Ϊ10002��
					arr[i] = 10002;                        //��Ϊ10002������϶����ܱ�������
				} else
					continue;
			}
		}
		System.out.println("ɸѡ��������Filtered series");
		
		for (int j = 2; j < arr.length; j++) {
			if (arr[j] != 10002) {
				System.out.println(arr[j]);
			}

		}
	}
}
