package matrixzerose;
import java.util.ArrayList;
import java.util.Scanner;

public class arrylistshangping {
	
		public static void main (String[] agrs) {
			ArrayList<Integer> arrayList =new ArrayList<Integer>();
			 arrayList.add(5);
	         arrayList.add(15);
	         arrayList.add(18);
	         System.out.println("1号看明细，2号改数，3号退出");
	       //ArrayList<goods> array =new ArrayList<goods>();//goods是一个对象。
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
					return;//跳出两个循环用return
				
				}
			}				

	}

		private static void exitgame() {
				System.out.println("quit");
				
				
			// TODO Auto-generated method stub
			
		}

		private static void updata(ArrayList<Integer> arrayList) {
			System.out.println("请选择要更改的产品序号");
			int key =new Scanner(System.in).nextInt();
			
			if (key ==1){
				System.out.println("请输入1号产品数量");
				int key1 =new Scanner(System.in).nextInt();
				arrayList.set(0,key1);
				
				
				
			}
			if (key ==2){
				System.out.println("请输入2号产品数量");
				int key2 =new Scanner(System.in).nextInt();
				arrayList.set(1,key2);
				
				
			}
			if (key ==3){
				System.out.println("请输入3号产品数量");
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
		
			System.out.println("--------------------商城库存清单-------------------------------------");
			System.out.println("序号     品牌型号   	尺寸    	价格    	库存数");
		
			System.out.println(macBrand+"	"+macSize+"	"+macPrice+"	"+arrayList.get(0));
			System.out.println(thinkpadBrand+"	"+thinkpadSize+"	"+thinkpadPrice+"	"+arrayList.get(1));
			System.out.println(ASUSBrand+"	"+ASUSSize+"	"+ASUSPrice+"	"+arrayList.get(2));
		
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("总库存数："+totalCount); 
			System.out.println("库存商品总金额："+totalMoney);
			
			
				
			
		}

		
	}

//退出两层循环，用



