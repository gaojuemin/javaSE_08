/*2.根据需求，完成如下代码（只用继承），并在测试类中进行测试。
	需求一：
		项目经理类 
			属性：姓名 工号 工资 奖金
			行为：工作work(打印姓名、工号、工资、奖金)
		程序员类
			属性：姓名 工号 工资
			行为：工作work(打印姓名、工号、工资)
	需求二：
		已知学生类和老师类如下：
			属性:姓名,年龄
			行为:吃饭
			老师有特有的方法:讲课
			学生有特有的方法:学习
	需求三：
		已知猫类和狗类：
			属性:毛的颜色,腿的个数
			行为:吃饭
			猫特有行为:抓老鼠catchMouse
			狗特有行为:看家lookHome
			*/
package homework9_10;

class Employee { // 需求一父类 为啥前面加public就出错？
	private String Name; // 姓名
	private int SN; // 工号
	private int Wage; // 工资

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getSN() {
		return SN;
	}

	public void setSN(int SN) {
		this.SN = SN;
	}

	public int getwage() {
		return Wage;
	}

	public void setWage(int Wage) {
		this.Wage = Wage;
	}

	public void work() {
		System.out.println(
				"I am work," + "my name is " + getName() + " my SN is " + getSN() + " my wage is " + getwage());

	}
}

class People { // 需求二父类
	private String name; // 姓名
	private int age; // 年龄

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void act() {
		System.out.print("I am "+getName()+",I am "+getage()+" old ,"+"I am eatting ,");

	}
}

class Animal { // 需求三父类
	String colour; // 颜色
	int legnum; // 腿个数

	public String getcolour() {
		return colour;
	}

	public void setName(String colour) {
		this.colour = colour;
	}

	public int getlegnum() {
		return legnum;
	}

	public void setlegnum(int legnum) {
		this.legnum = legnum;
	}

	public void eat() {
		System.out.print("I am " + getcolour() + " I have " + getlegnum() + " legs " + " I am eatting,");

	}
}

class Developer extends Employee { // 程序员类

}

class Manager extends Employee { // 项目经理类
	int bonus;

	public int getbonus() {
		return bonus;
	}

	public void setbonus(int bonus) {
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("I am work," + "my name is " + getName() + " my SN is " + getSN() + " my wage is "
				+ getwage() + " bonus is " + getbonus());

	}
}

class student extends People { // 学生类

	public void sw1() {
		System.out.println("I am learning");

	}

}

class teacher extends People { // 老师类
	public void sw2() {
		System.out.println("I am teaching");
	}
}

class cat extends Animal {       //猫类
	public void ac1() {
		System.out.println("I can catch mouse");

	}
}

class dog extends Animal {     //狗类
	public void ac2() {
		System.out.println("I can look Home");
	}
}
