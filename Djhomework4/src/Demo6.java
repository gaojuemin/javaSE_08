import java.util.ArrayList;
import java.util.Scanner;

public class Demo6 {
	public static void main(String args[]){
		newMain();
		}
		//��Ҫ����
		public static void newMain(){
			ArrayList<Commer> array = new ArrayList<Commer>();
			addCommer(array);
			while(true){
				switch(helloCommer()){
				case 1:
					printCommer(array);
					break;
				case 2:
					updata(array);
					break;
				case 3:
					System.out.println("��л����ʹ�� �ټ���");
					return ;
				default:
					System.out.println("���������������������룡");
				}
			}
		}
		//����
		public static int helloCommer(){
			System.out.println("-------------������------------");
			System.out.println("1.�鿴����嵥");
			System.out.println("2.�޸���Ʒ�������");
			System.out.println("3.�˳�");
			return new Scanner(System.in).nextInt();
		}
		//�����ƷԪ��
		public static void addCommer(ArrayList<Commer> array){
			Commer c1 = new Commer();
			c1.name = "macBook";c1.size = 13.3; c1.price = 8999.99;
			Commer c2 = new Commer();
			c2.name = " lenovo";c2.size = 15.6; c2.price = 4399.99;
			array.add(c1);array.add(c2);
		}
		//��ӡ����嵥
		public static void printCommer(ArrayList<Commer> array){
			int sum = 0, money = 0;
			System.out.println("-----------------��Ʒ�嵥-----------------");
			System.out.println("Ʒ��             �ߴ�/��   �۸�/Ԫ           ���/̨");
			for (int a = 0; a < array.size(); a++) {
				System.out.println(array.get(a).name + "    " + array.get(a).size + "   " + array.get(a).price
						+ "\t " + array.get(a).count + "  ");
				sum += array.get(a).count;
				money += array.get(a).count * array.get(a).price;
			}
			System.out.println("�������Ϊ:" + sum + "̨");
			System.out.println("����ܼ�Ϊ:" + money + "Ԫ");
		}
		//�޸Ŀ��
		public static void updata(ArrayList<Commer> array){
			for (int a = 0; a < array.size();a++){
				System.out.println("���޸���Ʒ"+array.get(a).name+"�Ŀ��");
				array.get(a).count = new Scanner(System.in).nextInt();
				System.out.println("�޸ĳɹ���");
			}
		}
	}




class Commer {
	int count;
	double price;
	double size;
	String name;
}
