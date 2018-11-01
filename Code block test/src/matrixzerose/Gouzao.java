package matrixzerose;

public class Gouzao {
	public abstract  class Employee {
	    private String name;
	    private String Id;

	    //���幹�췽����newʱֱ�Ӹ�ֵ��������
	    public Employee (String name,String Id) {
	        this.name = name;
	        this.Id = Id;
	    }

	    //���幤��,����Ա����Ҫ����
	    public  abstract void work();

	    //���ڳ�Ա����Ϊ˽�У����Ա�����set��get�������û�ȡ
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
    //��Ϊ�Ǽ̳й�ϵ�����й����������ؼ̳У���дҲ���еģ�
    //��Ϊ�ǳ��󷽷�������Develop��Ҳ�ǳ����࣬��Ҫ���Ǽ�abstract
    //public  abstract void work();

    public Develop (String name,String Id) {
        super(name, Id);
    }

}



public  abstract class Maintainer extends Employee {
    //��Ϊ�Ǽ̳й�ϵ�����й����������ؼ̳У���дҲ���еģ�
     //��Ϊ�ǳ��󷽷������� Maintainer��Ҳ�ǳ����࣬��Ҫ���Ǽ�abstract
     //public  abstract void work();

     public  Maintainer (String name,String Id) {
         super(name, Id);
     }
}

public class JavaEE extends Develop{

    public JavaEE(String name ,String Id) {
        super(name ,Id);
    }

    //��д����ĸ���ĳ��󷽷�work����Ϊ�����⹦�����Բ���ֱ�����ؼ̳�
    public void work() {
        System.out.println(super.getName()+"..."+super.getId()+" JavaEE����ʦ�ڿ����Ա�");
    }
}



public class Android extends Develop{
    public Android(String name ,String Id) {
           super(name ,Id);
    }

   //��д����ĸ���ĳ��󷽷�work
   public void work() {
       System.out.println(super.getName()+"..."+super.getId()+" Android����ʦ���з��ֻ��Ա��ͻ���");
   }
}



public class Network extends Maintainer{
    public Network(String name ,String Id) {
        super(name ,Id);
 }
    //��д����ĸ���ĳ��󷽷�work
    public void work() {
        System.out.println(super.getName()+"..."+super.getId()+" ���繤��ʦ�ڼ�������Ƿ�ͨ");
    }
}

public class Hardware extends Maintainer{
    public  Hardware(String name ,String Id) {
        super(name ,Id);
 }

    //��д����ĸ���ĳ��󷽷�work
    public void work() {
        System.out.println(super.getName()+"..."+super.getId()+" �����޸���ӡ��");
    }
}

public class Test {
    public static void main(String[] args) {
        JavaEE ee = new JavaEE("����","�з���001");
        Android and = new Android("����","�з���003");
        Network net = new Network("��ǿ","ά����006");
        Hardware hard = new Hardware("����","ά����008");

        ee.work();
        and.work();
        net.work();
        hard.work();
    }
}








