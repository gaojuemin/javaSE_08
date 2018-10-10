import java.util.ArrayList;
import java.util.Scanner;

/*定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
  A：遍历集合遍历输出。
  B：求出年龄最大的学生，然后将该对象的姓名变为：king。
*/

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		addStudent(list);         

		printStudent(list);

		compared(list);

		/*
		 * ArrayList<String> list = new ArrayList<String>(); // 存入ArrayList集合
		 * 
		 * Student stu1 = new Student();
		 *  // 创建3个学生对象实例，并赋值。
		 *   Student stu2 = new* Student();
		 *    Student stu3 = new Student();
		 *     stu1.name = "zhangsan";
		 *      stu2.name = "lisi"; 
		 *      stu3.name = "wangwu";
		 *       stu1.age = 16; 
		 *       stu2.age = 17; 
		 *       stu3.age = 18;
		 * stu1.sex = 'M';
		 *  stu2.sex = 'F';
		 *   stu3.sex = 'M';
		 * 
		 * 
		 * list.add(stu1); list.add(stu2); list.add(stu3); add报错？
		 * 
		 * System.out.println(list.get(0));
		 * 
		 * //for (int i = 0; i < list.size(); i++) { //String n = list.get(i);
		 * //System.out.println(n); //遍历输出学生 //}
		 * 
		 */

	}

	// private static void addStudent(ArrayList<String> list) //写这句就add报错,要注意参数，Student 和 String 的区别
	// The method add(String) in the type ArrayList<String> is not applicable for
	// the arguments (Student)
	public static void addStudent(ArrayList<Student> list) {       //添加学生
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			Student s = new Student();
			System.out.println("存储第" + i + "个学生姓名：");
			s.name = sc.next();
			System.out.println("存储第" + i + "个学生年龄：");
			s.age = sc.nextInt();
			System.out.println("存储第" + i + "个学生性别：");
			s.gender = sc.next();

			list.add(s);

		}
	}

	public static void printStudent(ArrayList<Student> list) {    //打印学生列表
		System.out.println("学生列表为");
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println("name：" + s.name + " age：" + s.age + " gender:" + s.gender);
		}

	}

	public static void compared(ArrayList<Student> list) {   //比较学生年龄
		int max = 0;
		int maxage = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);

			if (maxage < list.get(i).age) {
				max = i;
				maxage = list.get(i).age;
			}
		}
		list.get(max).name = "king";
		System.out.println("年龄最大的学生为");
		System.out.println(
				"name：" + list.get(max).name + " age：" + list.get(max).age + " gender:" + list.get(max).gender);

	}

}

class Student {                //创建学生对象（公供的和私有的，括号内和括号外都有问题。
	String name;
	int age;
	String gender;

}
