import java.util.ArrayList;
import java.util.Scanner;

/*����һ��ѧ����Student�����������������������䡢�Ա𣬴�������ѧ���������ArrayList�����С�
  A���������ϱ��������
  B�������������ѧ����Ȼ�󽫸ö����������Ϊ��king��
*/

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		addStudent(list);         

		printStudent(list);

		compared(list);

		/*
		 * ArrayList<String> list = new ArrayList<String>(); // ����ArrayList����
		 * 
		 * Student stu1 = new Student();
		 *  // ����3��ѧ������ʵ��������ֵ��
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
		 * list.add(stu1); list.add(stu2); list.add(stu3); add����
		 * 
		 * System.out.println(list.get(0));
		 * 
		 * //for (int i = 0; i < list.size(); i++) { //String n = list.get(i);
		 * //System.out.println(n); //�������ѧ�� //}
		 * 
		 */

	}

	// private static void addStudent(ArrayList<String> list) //д����add����,Ҫע�������Student �� String ������
	// The method add(String) in the type ArrayList<String> is not applicable for
	// the arguments (Student)
	public static void addStudent(ArrayList<Student> list) {       //���ѧ��
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			Student s = new Student();
			System.out.println("�洢��" + i + "��ѧ��������");
			s.name = sc.next();
			System.out.println("�洢��" + i + "��ѧ�����䣺");
			s.age = sc.nextInt();
			System.out.println("�洢��" + i + "��ѧ���Ա�");
			s.gender = sc.next();

			list.add(s);

		}
	}

	public static void printStudent(ArrayList<Student> list) {    //��ӡѧ���б�
		System.out.println("ѧ���б�Ϊ");
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println("name��" + s.name + " age��" + s.age + " gender:" + s.gender);
		}

	}

	public static void compared(ArrayList<Student> list) {   //�Ƚ�ѧ������
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
		System.out.println("��������ѧ��Ϊ");
		System.out.println(
				"name��" + list.get(max).name + " age��" + list.get(max).age + " gender:" + list.get(max).gender);

	}

}

class Student {                //����ѧ�����󣨹����ĺ�˽�еģ������ں������ⶼ�����⡣
	String name;
	int age;
	String gender;

}
