package matrixzerose;
import java.util.ArrayList;
import java.util.Scanner;

public class arrylistshangping {
	
		public static void main (String[] agrs) {
			ArrayList<Integer> arrayList =new ArrayList<Integer>();
			 arrayList.add(5);
	         arrayList.add(15);
	         arrayList.add(18);
	         System.out.println("1�ſ���ϸ��2�Ÿ�����3���˳�");
	       //ArrayList<goods> array =new ArrayList<goods>();//goods��һ������
			while (true) {
				
				int key =new Scanner(System.in).nextInt();
				
				switch (key) {
				case 1:
					show(arrayList);
					break;
					
				case 2:
					
					updata(arrayList);
					break;
				case 3:
					exitgame();
					//3
					return;//��������ѭ����return
				
				}
			}				

	}

		private static void exitgame() {
				System.out.println("quit");
				
				
			// TODO Auto-generated method stub
			
		}

		private static void updata(ArrayList<Integer> arrayList) {
			System.out.println("��ѡ��Ҫ���ĵĲ�Ʒ���");
			int key =new Scanner(System.in).nextInt();
			
			if (key ==1){
				System.out.println("������1�Ų�Ʒ����");
				int key1 =new Scanner(System.in).nextInt();
				arrayList.set(0,key1);
				
				
				
			}
			if (key ==2){
				System.out.println("������2�Ų�Ʒ����");
				int key2 =new Scanner(System.in).nextInt();
				arrayList.set(1,key2);
				
				
			}
			if (key ==3){
				System.out.println("������3�Ų�Ʒ����");
				int key3 =new Scanner(System.in).nextInt();
				arrayList.set(2,key3);;

			}

		}

		private static void show(ArrayList<Integer> arrayList) {
			
			
			String macBrand = "MacBookAir";
			double macSize = 13.3;
			double macPrice = 6988.88;
			

			
			
			String thinkpadBrand = "ThinkpadT450";
			double thinkpadSize = 14.0;
			double thinkpadPrice = 5999.99;
			

			
			
			String ASUSBrand = "ASUS-FL5800";
			double ASUSSize = 15.6;
			double ASUSPrice = 4999.50;
			
			
			int totalCount = arrayList.get(0) +  arrayList.get(1) +  arrayList.get(2);
			double totalMoney = (arrayList.get(0)* macPrice) + (arrayList.get(1) * thinkpadPrice) + (arrayList.get(2) * ASUSPrice);
		
			System.out.println("--------------------�̳ǿ���嵥-------------------------------------");
			System.out.println("���     Ʒ���ͺ�   	�ߴ�    	�۸�    	�����");
		
			System.out.println(macBrand+"	"+macSize+"	"+macPrice+"	"+arrayList.get(0));
			System.out.println(thinkpadBrand+"	"+thinkpadSize+"	"+thinkpadPrice+"	"+arrayList.get(1));
			System.out.println(ASUSBrand+"	"+ASUSSize+"	"+ASUSPrice+"	"+arrayList.get(2));
		
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("�ܿ������"+totalCount); 
			System.out.println("�����Ʒ�ܽ�"+totalMoney);
			
			
				
			
		}

		
	}

//�˳�����ѭ������



