import java.util.Scanner;

/*�����������󣬲��ô���ʵ�֣�
	(1)����¼���������������մ�С�����˳�����
	(2)����û��������3 2 1���������к��ӡ��ʽ"���մ�С����������˳��Ϊ��1 2 3"

*/
public class Demo3 {
	public static void main(String[] args) {
		int N[] = new int[3];                 //����һ��3��Ԫ�ص�����
		int temp;                             //�м�����ݴ����
		int i ;                               //ѭ������
		int j ;
		System.out.println("������3����");
		for (int a =0;a<3;a++) {                       //���ռ�������������
			Scanner scanner = new Scanner(System.in);
			N[a] = scanner.nextInt();                 //��ֵ������N
		}
		for(i=0;i<N.length-1;i++) {                  //ʹ��ð�ݷ�����
			for (j=0;j<N.length-1-i;j++ ) {
				if(N[j]>N[j+1]) {                    //ԭ�����N[1]��N[2]�󣬾Ͱ�������ֵ������
					temp = N[j];
					N[j]=N[j+1];
					N[j+1]=temp;
				}
			}
				}
		
		System.out.print("���մ�С����������˳��Ϊ��");
		for (int a =0;a<3;a++) {
		System.out.print(" "+N[a]);}

	}
	
}
