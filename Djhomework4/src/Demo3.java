import java.util.ArrayList;

/*.����һ���ֻ���Phone��������������Ʒ��(brand)���۸�(price)����ɫ(color)��
  �����ĸ��ֻ�("С��"��"��Ϊ"��"����"��"���")�������ArrayList�����У������������
*/
public class Demo3 {
	public static void main(String[] args) {
	ArrayList<Phone> list = new ArrayList<Phone>();
	Phone s = new Phone();
	s.brand = "С��";
	s.price= 2000;
	s.color = "red";
	list.add(s);
	
	Phone s1 = new Phone();
	s1.brand = "��Ϊ";
	s1.price= 2500;
	s1.color = "black";
	list.add(s1);
	
	Phone s2 = new Phone();
	s2.brand = "����";
	s2.price= 1800;
	s2.color = "green";
	list.add(s2);
	
	Phone s3 = new Phone();
	s3.brand = "���";
	s3.price= 1500;
	s3.color = "blue";
	list.add(s3);
	System.out.println("�����ֻ���");
	System.out.println("Ʒ�� ��ɫ   �۸�");
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