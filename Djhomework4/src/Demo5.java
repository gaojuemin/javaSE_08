import java.util.ArrayList;

/*利用上面的三个案例，分别演示ArrayList集合中的以下常用方法：
	 *  public boolean add(元素类型 e)直接向集合添加元素

	 *  public void add(int index,元素类型 e)在指定索引处向集合添加元素
	 
	 *  public 元素类型 remove(int index)删除指定索引位置的元素
	 
	 *  public 元素类型 set(int index,元素类型 e)修改指定索引位置的元素
	 
	 *  public int size()获取集合长度
	 
	 *  public 元素类型 get(int index)根据指定索引获取集合元素
	 *   *  public 元素类型 set(int index,元素类型 e)修改指定索引位置的元素
	 
	 *  public int size()获取集合长度
	 
	 *  public 元素类型 get(int index)根据指定索引获取集合元素

*/
public class Demo5 {
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0;i<10;i++) {
			list.add(i);
		}
		System.out.println("原集合");
		for (int i = 0;i<10;i++) {
			System.out.print(list.get(i)+" "); 
		}
		System.out.println();
		
		list.add(11);        //直接向集合添加元素
		list.add(0, 12);    //0号位置添加元素，开头为12
		list.remove(1);	    //删除1号位置元素，除掉0
		list.set(2, 18);    //替代1号位置元素，2替换成18
		System.out.println("修改后集合");
		for (int i = 0;i<list.size();i++) {        //获取集合长度
			System.out.print(list.get(i)+" ");  //根据指定索引获取集合元素
		}
		
	}

}
