package matrixzerose;

import java.util.Scanner;

public class xiugaituichu {
	public static void main (String[] agrs) {
		int[] arr = {5,15,18};
		
		while (true) {
			
			int key =new Scanner(System.in).nextInt();
			System.out.println("��ѡ��Ҫ���ĵĲ�Ʒ���");
			switch (key) {
			case 1:
				show(arr);
				break;
				
			case 2:
				updata(arr);
				break;
			case 3:
				exitgame();	
				break;
				
			
			}
		}				

}

	private static void exitgame() {
			System.out.println("quit");
		// TODO Auto-generated method stub
		
	}

	private static void updata(int[]arr) {
		
		int key =new Scanner(System.in).nextInt();
		System.out.println("��ѡ��Ҫ���ĵĲ�Ʒ���");
		if (key ==1){
			System.out.println("�������µĲ�Ʒ����");
			int key1 =new Scanner(System.in).nextInt();
			arr[0] = key1;
			
			
			
		}
		if (key ==2){
			System.out.println("�������µĲ�Ʒ����");
			int key2 =new Scanner(System.in).nextInt();
			arr[1] = key2;
			
			
		}
		if (key ==3){
			System.out.println("�������µĲ�Ʒ����");
			int key3 =new Scanner(System.in).nextInt();
			arr[2] = key3;

		}

	}

	private static int[] show(int a[]) {
		
		
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		

		
		
		String thinkpadBrand = "ThinkpadT450";
		double thinkpadSize = 14.0;
		double thinkpadPrice = 5999.99;
		

		
		
		String ASUSBrand = "ASUS-FL5800";
		double ASUSSize = 15.6;
		double ASUSPrice = 4999.50;
		
		
		int totalCount = a[0] + a[1] + a[2];
		double totalMoney = (a[0] * macPrice) + (a[1] * thinkpadPrice) + (a[2] * ASUSPrice);
	
		System.out.println("--------------------�̳ǿ���嵥-------------------------------------");
		System.out.println("���     Ʒ���ͺ�   	�ߴ�    	�۸�    	�����");
	
		System.out.println(macBrand+"	"+macSize+"	"+macPrice+"	"+a[0]);
		System.out.println(thinkpadBrand+"	"+thinkpadSize+"	"+thinkpadPrice+"	"+a[1]);
		System.out.println(ASUSBrand+"	"+ASUSSize+"	"+ASUSPrice+"	"+a[2]);
	
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("�ܿ������"+totalCount); 
		System.out.println("�����Ʒ�ܽ�"+totalMoney);
		
		return a;
			
		
	}

	
}
