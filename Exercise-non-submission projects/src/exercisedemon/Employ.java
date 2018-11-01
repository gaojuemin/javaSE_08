package exercisedemon;

//员工
  class  Employ {
	private String id;
	private String name;
	
	public Employ() {
		super();
	}	
	public Employ(String id, String name) {
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
	//public abstract void work(); 
	public static void main(String[] args) {
		
		JavaEE aa= new JavaEE("123456", "david");
		
		aa.work();
	}

}


//开发者
	
abstract class Dev extends Employ {
	
		public Dev() {
			super();
		}
		
		public Dev(String id, String name) {
			super(id, name);
		}
	}
	
//维护
abstract class Main extends Employ {
	
		public Main() {
			super();
		}
	    public Main(String id, String name) {
			super(id, name);
		}
	}
	
//JAVAEE
 class JavaEE extends Dev {
	
	public JavaEE() {
		
	}
	public JavaEE(String id, String name) {
		super(id, name);
	}

	public void work() {
		System.out.println("id is" + getId() +"name is"+ getName() + " make a site");
	}
}
 
 
//硬件维护
class Hardware extends Main {
		
		public Hardware() {
			super();
		}
	
		public Hardware(String id, String name) {
			super(id, name);
		}

		
		public void work() {
			System.out.println("id is " + getId() + "name is " + getName() + "is repair");
		}
	}
//安卓工程师
 class Android extends Dev {
	
	public Android() {
		super();
	}

	public Android(String id, String name) {
		super(id, name);
	}


	public void work() {
		System.out.println("id is" + getId() + " name is " + getName() + " make a phone");
	}
}
//网络维护
 class Network extends Main {
		
		public Network() {
			super();
		}
	
		public Network(String id, String name) {
			super(id, name);
		}

		
		public void work() {
			System.out.println("id is " + getId() + "  name is" + getName() + "is check net");
		}
	
//

		
	

}

	
	
