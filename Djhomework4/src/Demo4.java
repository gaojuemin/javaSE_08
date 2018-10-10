import java.util.ArrayList;

/*定义一个员工类Employee，包含三个属性姓名、工号、工资，
创建三个员工对象存入ArrayList集合中，并遍历输出。
*/
public class Demo4 {
	public static void main (String[]args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee s = new Employee();
		s.name = "zhangsan";
		s.sn= 1000;
		s.wage = 3500;
		list.add(s);
		
		Employee s1 = new Employee();
		s1.name = "lisi";
		s1.sn= 1001;
		s1.wage = 4500;
		list.add(s1);
		
		Employee s2= new Employee();
		s2.name = "zhaowu";
		s2.sn= 1002;
		s2.wage = 5500;
		list.add(s2);
		
		Employee s3 = new Employee();
		s3.name = "wangliu";
		s3.sn= 1003;
		s3.wage = 6500;
		list.add(s3);
		System.out.println("本店员工有");
		System.out.println("姓名              工号            .工资");
		for (int i = 0; i < list.size(); i++) { 
			Employee n = list.get(i);
			System.out.println(n.name+" "+n.sn+" "+n.wage); 
			}
		}

	}

	class Employee {                
		String name;
		int sn;
		int wage ;
		

}
