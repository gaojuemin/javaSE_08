/*
 * 	A:��ά���������ȡ��ÿһ��ֵ

	B:��˾�����۶����
		ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
		��һ���ȣ�22,66,44
		�ڶ����ȣ�77,33,88
		�������ȣ�25,45,65
		���ļ��ȣ�11,66,99

 */
public class Demo9 {
	public static void main(String[] args) {
		int arr[][] = new int [4][3];
		arr[0]=new int[] {22,66,44};
		arr[1]=new int[] {77,33,88};
		arr[2]=new int[] {25,45,65};
		arr[3]=new int[] {11,66,99};
		
		int sum = 0;
		System.out.print("ȫ������۶�Ϊ ");
		for (int i=0;i<arr.length;i++) {   // ��������Ԫ��
			for(int j=0;j<arr[i].length;j++) {   // ����С����ÿ���˵����۶�
				System.out.print(arr[i][j]+"��Ԫ ");
				sum = sum + arr[i][j];      //�ۼӸ����۶�
			}
		}
		System.out.println();
		System.out.print("ȫ��������ܶ�Ϊ"+sum+"��Ԫ");
	}
}
