import java.util.ArrayList;
import java.util.Scanner;

public class Demo6 {
	public static void main(String args[]){
		newMain();
		}
		//主要方法
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
					System.out.println("感谢您的使用 再见！");
					return ;
				default:
					System.out.println("您的输入有误请重新输入！");
				}
			}
		}
		//界面
		public static int helloCommer(){
			System.out.println("-------------库存管理------------");
			System.out.println("1.查看库存清单");
			System.out.println("2.修改商品库存数量");
			System.out.println("3.退出");
			return new Scanner(System.in).nextInt();
		}
		//添加商品元素
		public static void addCommer(ArrayList<Commer> array){
			Commer c1 = new Commer();
			c1.name = "macBook";c1.size = 13.3; c1.price = 8999.99;
			Commer c2 = new Commer();
			c2.name = " lenovo";c2.size = 15.6; c2.price = 4399.99;
			array.add(c1);array.add(c2);
		}
		//打印库存清单
		public static void printCommer(ArrayList<Commer> array){
			int sum = 0, money = 0;
			System.out.println("-----------------商品清单-----------------");
			System.out.println("品名             尺寸/寸   价格/元           库存/台");
			for (int a = 0; a < array.size(); a++) {
				System.out.println(array.get(a).name + "    " + array.get(a).size + "   " + array.get(a).price
						+ "\t " + array.get(a).count + "  ");
				sum += array.get(a).count;
				money += array.get(a).count * array.get(a).price;
			}
			System.out.println("库存总量为:" + sum + "台");
			System.out.println("库存总价为:" + money + "元");
		}
		//修改库存
		public static void updata(ArrayList<Commer> array){
			for (int a = 0; a < array.size();a++){
				System.out.println("请修改商品"+array.get(a).name+"的库存");
				array.get(a).count = new Scanner(System.in).nextInt();
				System.out.println("修改成功！");
			}
		}
	}




class Commer {
	int count;
	double price;
	double size;
	String name;
}
