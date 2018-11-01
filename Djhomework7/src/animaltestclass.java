/*定义一个父类Animal eat方法 , 定义两个子类 Dog  特有方法keepHome ,
 * Cat 特有方法 catchMouse ;并且 重写eat方法
   测试类中写一个方法,参数列表有一个参数Animla类型,
   要求: 调用该方法分别传递Dog对象 和Cat 对象, 使用instanceof进行将转后调用eat,和他们的特有方法
*/
class Animal {// 动物父类
	public void eat() {
		System.out.println("eat eat eat");
	}
}

class Dog extends Animal { // 定义狗类
	public void eat() {
		System.out.println("I am eat,wang~ wang~ wang~");
	}

	public void kHome() {
		System.out.println("I can keepHome");

	}
}

class Cat extends Animal { // 定义猫类
	public void eat() {
		System.out.println("I am eat,miao~ miao~ miao~");
	}

	public void cMouse() {
		System.out.println("I can catchMouse");

	}
}

class test { // 测试类含测试方法
	static void t(Animal x) {
		if (x instanceof Dog) {     //如果是狗就打印狗的特有方法
			System.out.println("it is a dog");
			((Dog) x).eat();
			((Dog) x).kHome();
		}

		else if (x instanceof Cat) {   //如果是猫就打印猫的特有方法
			System.out.println("it is a cat");
			((Cat) x).eat();
			((Cat) x).cMouse();
		} 
		else {                     //如果不是狗和猫就打印不知道
			System.out.println("I do not know what it is");
		}
	}

}

public class animaltestclass { // 调用各个类进行测试
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		Animal c = new Animal();
		test.t(a);
		System.out.println("--------------");
		test.t(b);
		System.out.println("--------------");
		test.t(c);

	}

}
