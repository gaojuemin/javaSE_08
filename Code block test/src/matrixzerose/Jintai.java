package matrixzerose;
/*
 * public class Fu {
      static   int i  = 1 ;

      public static void show(){
          System.out.println("父类静态方法show");
      } 
}
1
2
3
4
5
6
7
8
子类：

public class Zi extends Fu{
     static   int i  = 1 ;

     public static void show(){
      System.out.println("子类静态方法show");
     } 
}

测试类：


 * 多态调用中
 *
 * 编译都看父类，等号左边的父类，父类有则编译成功，父类没有则编译失败。
 * 运行，如果是静态方法，则运行父类的静态方法
 *          非静态方法，则运行子类的重写方法
 * 
 *  成员变量，编译运行都看父类

public class Test {
   public static void main(String[] args) {
        Fu f = new Zi ();
        System.out.println(f.i);//输出结果为：1   成员变量看父类
        f.show();//调用父类的静态方法
   }
}


//////////////




  class Demo {
            public static Person getPerson(){
                //普通方式
                //Person p = new Person();  
                //return p;

                //匿名对象作为方法返回值
                return new Person(); 
            }

            public static void method(Person p){}
        }

        class Test {
            public static void main(String[] args) {
                //调用getPerson方法，得到一个Person对象
                Person person = Demo.getPerson();

                //调用method方法
                Demo.method(person);
                //匿名对象作为方法接收的参数
                Demo.method(new Person());
            }
        }


///////////////////////// 内部就近法原则
public class Outer {
    int i  = 1;
    class Inner {
        int i  = 2;
        public void inner(){
            int i = 3;
            System.out.println(i);
        }
    }
}


public class Test {
      public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.inner();//输出结果为：3
    }
}


this. 变量名：调用内部类成员变量 
定义类：
public class Outer {
    int i  = 1;
    class Inner {
        int i  = 2;
        public void inner(){
            int i = 3;
            System.out.println(this.i);
        }
    }
}


测试类：

public class Test {
      public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.inner();//输出结果为：2
    }
}



外部类.this.变量名：调用外部类成员变量 
定义类：
public class Outer {
    int i  = 1;
    class Inner {
        int i  = 2;
        public void inner(){
            int i = 3;
            System.out.println(Outer.this.i);
        }
    }
}


测试类：

public class Test {
      public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.inner();//输出结果为：1
    }
}



 * 将一个类，定义在方法中

public class Outer {

    public void out(){

        class Inner {
          public void inner(){
            System.out.println("局部内部类方法");
          }
        }
        Inner in = new Inner();
        in.inner();
    }
}

测试类：

public class Test {
     public static void main(String[] args) {
        //调用局部内部类的方法inner
         new Outer().out();//输出结果为：局部内部类方法
    }
}

定义类：

public interface Smoking {
     public  abstract void smoking();

      * 实现类，实现接口，重写抽象方法，创建实现类对象调用方法
      * 
      * class XXX implement是 Smoking{
      *     public void smoking(){
      *     
      *     }
      * }
      * 调用时：
      * XXX  x = new XXX();
      * x.smoking();
      * 或者多态调用：
      * Smoking s = new XXX();
      * s.smoking();
      * 
      * 匿名内部类，简化代码，将以上代码合为一步完成。
   
}


测试类：

public class Test {
   public static void main(String[] args) {
    //使用匿名内部类简化代码，将实现类，实现接口，重写抽象方法，创建实现类对象调用方法等代码合为一步完成。
    格式：
     *     new 接口/父类(){
     *       重写抽象方法
     *     };相当于子类对象
     * 子类对象.方法名→即可调用方法
   
      new Smoking() {
          public void smoking() {
              System.out.println("人在吸烟"); 
          } 
      }.smoking() ;//输出结果为：人在吸烟
   }
}


定义类：
public abstract class Animal {
    public abstract  void eat();
    public abstract  void sleep();
}

/*
 * public static void main(String[] args) {

         new  Animal() {
            public void eat() {
                 System.out.println("在吃饭");
            }
            public void sleep() {
             System.out.println("在睡觉");
        }
        };
 * 以上代码就是Animal的子类对象
 * 利用多态性，父类引用 = 子类的对象  可以同时调用两个方法
 
public class Test {
     public static void main(String[] args) {

         Animal a = new  Animal() {
            public void eat() {
                 System.out.println("在吃饭");
            }
            public void sleep() {
             System.out.println("在睡觉");
        }
        };
        a.eat();// 输出结果：在吃饭
        a.sleep();// 输出结果：在睡觉
    }
}

定义类：

public class Person {
    private String name;
    private int age;
      public Person(String name,int age) {
          this.name= name;
          this.age = age;
          System.out.println("我是构造方法");
      }
      //构造代码块
      {
          System.out.println("我是构造代码块"); 
      }
}

测试类：

public class Test {
    public static void main(String[] args) {
        new Person("张三",20);
        //输出结果：我是构造代码块
        //        我是构造方法
    }
}

定义类：

public class Person {
    private String name;
    private int age;
      public Person(String name,int age) {
          this.name= name;
          this.age = age;
          System.out.println("我是构造方法");
      }
      //构造代码块
      {
          System.out.println("我是构造代码块"); 
      }
      static {
          System.out.println("我是静态代码块");
      }
}

测试类：

public class Test {
     public static void main(String[] args) {
            new Person("张三",20);
            new Person("张四",22);
     }
}
//输出结果为：我是静态代码块
//          我是构造代码块
//          我是构造方法
//          我是构造代码块
//          我是构造方法
--------------------- 

*/
public class Jintai {

}
