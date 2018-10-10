import java.util.ArrayList;

/*.定义一个手机类Phone，包含三个属性品牌(brand)、价格(price)、颜色(color)。
  创建四个手机("小米"、"华为"、"乐视"、"奇酷")对象存入ArrayList集合中，并遍历输出。
*/
public class Demo3 {
	public static void main(String[] args) {
	ArrayList<Phone> list = new ArrayList<Phone>();
	Phone s = new Phone();
	s.brand = "小米";
	s.price= 2000;
	s.color = "red";
	list.add(s);
	
	Phone s1 = new Phone();
	s1.brand = "华为";
	s1.price= 2500;
	s1.color = "black";
	list.add(s1);
	
	Phone s2 = new Phone();
	s2.brand = "乐视";
	s2.price= 1800;
	s2.color = "green";
	list.add(s2);
	
	Phone s3 = new Phone();
	s3.brand = "奇酷";
	s3.price= 1500;
	s3.color = "blue";
	list.add(s3);
	System.out.println("本店手机有");
	System.out.println("品牌 颜色   价格");
	for (int i = 0; i < list.size(); i++) { 
		Phone n = list.get(i);
		System.out.println(n.brand+" "+n.color+" "+n.price+" "); 
		}
	}

}

class Phone {                
	String brand;
	int price;
	String color;
}