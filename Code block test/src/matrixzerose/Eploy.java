package matrixzerose;

public abstract class Employee {
	private String id;// 员工编号
	private String name; // 员工姓名
	
	//空参数构造方法
	public Employee() {
		super();
	}
	//有参数构造方法
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//工作方法（抽象方法）
	public abstract void work(); 
}


public abstract class Developer extends Employee {
	//空参数构造方法
	public Developer() {
		super();
	}
	//有参数构造方法
	public Developer(String id, String name) {
		super(id, name);
	}
}



public abstract class Maintainer extends Employee {
	//空参数构造方法
	public Maintainer() {
		super();
	}
	//有参数构造方法
	public Maintainer(String id, String name) {
		super(id, name);
	}
}


public class JavaEE extends Developer {
	//空参数构造方法
	public JavaEE() {
		super();
	}
	//有参数构造方法
	public JavaEE(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在研发淘宝网站");
	}
}



public class Android extends Developer {
	//空参数构造方法
	public Android() {
		super();
	}
	//有参数构造方法
	public Android(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在研发淘宝手机客户端软件");
	}
}


public class Network extends Maintainer {
	//空参数构造方法
	public Network() {
		super();
	}
	//有参数构造方法
	public Network(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在检查网络是否畅通");
	}
}
	


public class Hardware extends Maintainer {
	//空参数构造方法
	public Hardware() {
		super();
	}
	//有参数构造方法
	public Hardware(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在修复打印机");
	}
}


public class Test {
	public static void main(String[] args) {
		//创建JavaEE工程师员工对象，该员工的编号000015，员工的姓名 小明
		JavaEE ee = new JavaEE("000015", "小明");
		//调用该员工的工作方法
		ee.work();
	}
}

	




