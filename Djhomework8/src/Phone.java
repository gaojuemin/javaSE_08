/*

1.final修饰类，修饰方法，修饰变量有什么特点?
	final修饰类不可以被继承，但是可以继承其他类。
	final修饰的方法不可以被覆盖,但父类中没有被final修饰方法，子类覆盖后可以加final。
	final修饰的变量称为常量，这些变量只能赋值一次。
	引用类型的变量值为对象地址值，地址值不能更改，但是地址内的对象属性值可以修改。
	修饰成员变量，需要在创建对象前赋值，否则报错。(当没有显式赋值时，多个构造方法的均需要为其赋值。)

2、package,import,class之间有没有顺序关系？
	import导包代码书写的位置：在声明包package后，定义所有类class前，使用导包import包名.包名.类名;
	导包的格式：import package.class;

3、Java中的权限修饰符有哪些？
	有 public	 ，protected，default，private

4、内部类的访问特点是什么？
	成员内部类，定义在外部类中的成员位置。与类中的成员变量相似，可通过外部类对象进行访问
	访问方式  ：外部类名.内部类名 变量名 = new 外部类名().new 内部类名();

5、局部内部类访问局部变量，该局部变量必须用哪个关键字修饰，为什么？
	局部内部类访问 的 局部变量必须用 final修饰，以防止更改局部变量的值。

6、内部类的格式?  它的本质是什么？
	定义格式
	class 外部类 { 
		修饰符 class 内部类 {
			//其他代码
		}
			}
内部类是为了应对更为复杂的类间关系，本质是间接的解决了一个类只能有一个父类的问题，实现了多继承，以及对
外部的隐藏细节。


7、匿名内部类的前提条件，格式分别是什么？
	临时定义某一指定类型的子类
	定义后即刻创建刚刚定义的这个子类的对象
	格式：
	new 父类或接口(){
	//进行方法重写
};


8.代码块的分类? 
	1局部代码块 2构造代码块3静态代码块

9.不运行下面代码: 口述打印结果
class Student {
			      static {
		       System.out.println("Student 静态代码块");
     	}
	
      	{
		        System.out.println("Student 构造代码块");
      	}
	
       	public Student() {
		          System.out.println("Student 构造方法");
       	}

}

class Demo2_Student {
      	static {
		      System.out.println("Demo2_Student静态代码块");
      	}
	
	      public static void main(String[] args) {
       	 	System.out.println("我是main方法");
		   	Student s1 = new Student();
		        Student s2 = new Student();
      	}
}

Demo2_Student静态代码块
我是main方法
Student 静态代码块
Student 构造代码块
Student 构造方法
Student 构造代码块
Student 构造方法
构造代码块是定义在类中成员位置的代码块
特点：
	优先于构造方法执行，构造代码块用于执行所有对象均需要的初始化动作
	每创建一个对象均会执行一次构造代码块。
静态代码块是定义在成员位置，使用static修饰的代码块。
特点：
	它优先于主方法执行、优先于构造代码块执行，当以任意形式第一次使用到该类时执行。
	该类不管创建多少对象，静态代码块只执行一次。
	可用于给静态变量赋值，用来给类进行初始化。


*/

public abstract class Phone { //phone父类
	public void call() {
		System.out.println("call someone");
	}

	public void sendMessage() {
		System.out.println("send message to someone");
	}

}
