/*
 * 
1.简述自定义数据类型的定义格式和使用方式？
将现实生活中的事物抽象成代码，可以使用自定义的数据类型（类）来描述（映射）现实生活中的事物。
类，是引用数据类型，与之前的所有引用数据类型相同，自定义类也是一种数据类型。
只是自定义类型并非Java预先提供好的类型，而是自己定义的一种引用数据类型用来描述一个事物。

类的定义格式
创建java文件，与类名相同
public class 类名{
	数据类型  属性名称1；
	数据类型  属性名称2；
	…
}

使用方法
导包：将所有的类放到同一个文件夹下，可以避免导包。
创建对象：数据类型  变量名 = new 数据类型();
调用方法：目前我们定义的自定义类不涉及方法，只是属性
访问属性：变量名.属性 


2.简述ArrayList集合的定义格式和常用方法的功能？
定义格式
ArrayList<要存储元素的数据类型> 变量名 = new ArrayList<要存储元素的数据类型>();

常用方法功能
boolean add（Object obj）	将指定元素obj追加到集合的末尾
Object get（int index）	返回集合中指定位置上的元素
int size（）	返回集合中的元素个数
boolean add（int index,  Object obj）	将指定元素obj插入到集合中指定的位置
Object remve（int index）	从集合中删除指定index处的元素，返回该元素
void clear（）	清空集合中所有元素
Object set（int index, Object obj）	用指定元素obj替代集合中指定位置上的元素


4.以下选项错误的是？
	A.获取数组的长度用length方法                      //错误应该是属性
	B.获取字符串的长度用length属性                                //错误，应该是方法
	C.获取集合ArrayList的长度用length方法        //  错误，应该是size方法
	D.获取数组的长度用length属性                  //正确
	E.获取字符串的长度用length方法          //正确
	F.获取集合ArrayList的长度用length属性   //错误应该是size方法
	G.获取集合ArrayList的长度用size属性       //错误，应该是方法
	H.获取集合ArrayList的长度用size方法       //正确
	
1 java中的length属性是针对数组说的,比如说声明了一个数组,想知道这个数组的长度则用到了length这个属性.
2 java中的length()方法是针对字符串String说的,如果想看这个字符串的长度则用到length()这个方法.
3.java中的size()方法是针对泛型集合说的,如果想看这个泛型有多少个元素,就调用此方法来查看!


 */

