import java.util.Scanner;

/*�����������󣬲��ô���ʵ�֣�
	(1)���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
	(2)�ǹ��ʵ��������£�
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	(3)����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ"��Ŀǰ������10�꣬
	��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
 */
 
public class Demo2 {
	public static void main(String[] args) {
		int age = 0;         //���幤��
		int sa = 0;          //���幤��
		int addsa = 0;       //Ӧ�ǹ���
		int fsa = 0;       //�����Ǻ���
		System.out.println("��������Ĺ���");
		Scanner scanner1 = new Scanner(System.in);
		age = scanner1.nextInt();
		System.out.println("��������Ĺ���");
		Scanner scanner2 = new Scanner(System.in);
		sa = scanner2.nextInt();
		if ((10<=age)&(age<15)){                      //�жϹ���
			addsa = 5000;                             //�ӹ��ʵĶ���
			fsa = sa + addsa;                         //�Ӻ��ʶ���
			System.out.println("��Ŀǰ������"+age+"��,��������Ϊ"+sa+"Ԫ,Ӧ�ǹ���"+addsa+"Ԫ,�Ǻ��� "+fsa+"Ԫ");
		}
		else if ((5<=age)&(age<10)){
			addsa = 2500;
			fsa = sa + addsa;
			System.out.println("��Ŀǰ������"+age+"��,��������Ϊ"+sa+"Ԫ,Ӧ�ǹ���"+addsa+"Ԫ,�Ǻ��� "+fsa+"Ԫ");			
		}
		else if ((3<=age)&(age<5)){
			addsa = 1000;
			fsa = sa + addsa;
			System.out.println("��Ŀǰ������"+age+"��,��������Ϊ"+sa+"Ԫ,Ӧ�ǹ���"+addsa+"Ԫ,�Ǻ��� "+fsa+"Ԫ");			
		}
		else if ((1<=age)&(age<3)){
			addsa = 500;
			fsa = sa + addsa;
			System.out.println("��Ŀǰ������"+age+"��,��������Ϊ"+sa+"Ԫ,Ӧ�ǹ���"+addsa+"Ԫ,�Ǻ��� "+fsa+"Ԫ");
		}
		else if ((0<=age)&(age<1)){
			addsa = 200;
			fsa = sa + addsa;			
		}
		else System.out.println("���������");
	}

}
