import java.util.Scanner;

//������(���ݼ���¼������,���Ҷ�Ӧ����)
public class Demo7 {
	public static void main(String[] args) {
		char week[] =  {'һ','��','��','��','��','��','��'};  //��������洢���ڼ�
		System.out.println("����������1-7����ѯ��Ӧ������");   //���ղ�ѯ��1-7
		Scanner sca = new Scanner(System.in);
		int ask = sca.nextInt();               
		if ((ask>7)|(ask<1)) {              //��ѯ1-7��Ӧ�����ڣ��糬����Χ����        
			System.out.println("������Ĳ�ѯ������");
		}
		else System.out.println("����ѯ��������"+week[ask-1]);
	}
	
}
