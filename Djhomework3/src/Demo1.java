import java.util.Scanner;
/*��д����ʵ���������ݣ�if���ʵ�ֿ��Գɼ��ֵȼ�(ʹ��switch���)��
	[90-100]	A�ȡ�
	[80-90) 	B�ȡ�
	[70-80) 	C�ȡ�
	[60-70) 	D�ȡ�
	[0-60)  	E�ȡ�
	����ݸ����ɼ��������Ӧ�ĵȼ���
	˵����"["��ʾ������")"��ʾ������
*/
public class Demo1 {
	public static void main(String agrs[]) {
		char l = 0;                             //����ɼ��ȼ�
		int i;                                  //iΪ�ɼ�
		System.out.println("��������ĳɼ�");		//��ʾ����ɼ�
		Scanner sco = new Scanner (System.in); 	//���ռ�������
		i = sco.nextInt();                        //�ɼ���ֵ��i
		if ((90<=i)&(i <100)){                      //��ʼ�жϳɼ��ĵȼ�
			l = 'a';			
		}
		else if ((80<=i)&(i <90)){
			l = 'b';			
		}
		else if ((70<=i)&(i <80)){
			l = 'c';			
		}
		else if ((60<=i)&(i <70)){
			l = 'd';			
		}
		else if ((0<=i)&(i <60)){
			l = 'e';			
		}
		else System.out.println("��û�гɼ�");
		                                      //��ʼ��ӡ�ȼ���
		switch (l) {                               
		case 'a':
			System.out.println("��ĳɼ���A��");
			break;
		case 'b':
			System.out.println("��ĳɼ���B��");
			break;
		case 'c':
			System.out.println("��ĳɼ���C��");
			break;
		case 'd':
			System.out.println("��ĳɼ���D��");
			break;
		case 'e':
			System.out.println("��ĳɼ���E��");
			break;
		}
	}

}
