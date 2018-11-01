package matrixzerose;

public class Gouzao {
	public abstract  class Employee {
	    private String name;
	    private String Id;

	    //定义构造方法，new时直接赋值姓名工号
	    public Employee (String name,String Id) {
	        this.name = name;
	        this.Id = Id;
	    }

	    //定义工作,凡是员工都要工作
	    public  abstract void work();

	    //由于成员变量为私有，所以必须用set、get方法调用获取
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setId(String Id) {
	        this.Id = Id;
	    }

	    public String getName() {
	        return name;
	    }
	    public String getId() {
	        return Id;
	    }

	}
	

}




public abstract class Develop extends Employee{
    //因为是继承关系，下列工作方法隐藏继承，不写也是有的，
    //因为是抽象方法，所以Develop类也是抽象类，不要忘记加abstract
    //public  abstract void work();

    public Develop (String name,String Id) {
        super(name, Id);
    }

}



public  abstract class Maintainer extends Employee {
    //因为是继承关系，下列工作方法隐藏继承，不写也是有的，
     //因为是抽象方法，所以 Maintainer类也是抽象类，不要忘记加abstract
     //public  abstract void work();

     public  Maintainer (String name,String Id) {
         super(name, Id);
     }
}

public class JavaEE extends Develop{

    public JavaEE(String name ,String Id) {
        super(name ,Id);
    }

    //重写父类的父类的抽象方法work，因为有特殊功能所以不能直接隐藏继承
    public void work() {
        System.out.println(super.getName()+"..."+super.getId()+" JavaEE工程师在开发淘宝");
    }
}



public class Android extends Develop{
    public Android(String name ,String Id) {
           super(name ,Id);
    }

   //重写父类的父类的抽象方法work
   public void work() {
       System.out.println(super.getName()+"..."+super.getId()+" Android工程师在研发手机淘宝客户端");
   }
}



public class Network extends Maintainer{
    public Network(String name ,String Id) {
        super(name ,Id);
 }
    //重写父类的父类的抽象方法work
    public void work() {
        System.out.println(super.getName()+"..."+super.getId()+" 网络工程师在检查网络是否畅通");
    }
}

public class Hardware extends Maintainer{
    public  Hardware(String name ,String Id) {
        super(name ,Id);
 }

    //重写父类的父类的抽象方法work
    public void work() {
        System.out.println(super.getName()+"..."+super.getId()+" 正在修复打印机");
    }
}

public class Test {
    public static void main(String[] args) {
        JavaEE ee = new JavaEE("张三","研发部001");
        Android and = new Android("李四","研发部003");
        Network net = new Network("李强","维护部006");
        Hardware hard = new Hardware("王刚","维护部008");

        ee.work();
        and.work();
        net.work();
        hard.work();
    }
}








