import java.util.Scanner;

//13.����¼�������������������������е����ֵ��ӡ�ڿ���̨��
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input x"); 
		int x = sc.nextInt();                 //���ռ��������
		System.out.println("please input y");
		int y = sc.nextInt();
		System.out.println("please input z");
		int z = sc.nextInt();
		if ((x>y)&&(x>z)){                    //��ʼ�Ա��ĸ���������
			System.out.println("the biggest number is "+x); 
		}
		else if ((y>x)&&(y>z)){
			System.out.println("the biggest number is "+y);
		}
		else if ((z>x)&&(z>y)){
			System.out.println("the biggest number is "+z);
		}
		else System.out.println("the biggest number is not only one");
	}
}
