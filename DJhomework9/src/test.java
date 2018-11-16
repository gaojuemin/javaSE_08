//hellojava,nihaojava,javazhengbang
public class test {
	public static void main(String[] args) {
		int a = findString("1111001111", "11");
		System.out.println(a);
	}
	public static int findString(String str, String key) {
		int c = 0;//计数器
		int i = 0;//索引
		while ((i = str.indexOf(key)) != -1) {//开始循环查找，结束条件indexOf==-1
			c++; //获取到的索引步进1	
			str = str.substring(i + 1);
		}
		return c;
	}
}
