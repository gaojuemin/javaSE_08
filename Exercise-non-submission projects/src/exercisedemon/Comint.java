package exercisedemon;

public class Comint {
	public static void main (String[] args) {
		int x =10;
		System.out.println(x);
		
	}
}
public class StringTest {
    public static void main(String[] args) {
      getCount("&A%Ve458ty1"); 
   }
    public static void getCount (String str) {
        //定义三个变量，计数
        int upper = 0 ;//大写
        int lower = 0 ;//小写
        int digit = 0 ;//数字
        //对字符串遍历
        for(int i = 0;i<str.length();i++) {
            //运用String类方法charAt,根据索引获取字符
            char c = str.charAt(i);
            //利用编码表做判断大小写：
            // 65-90：大写字母  97-122：小写字母  48-57：数字
            //这里写97或者'A'的效果是一样的，自动转换
            if(c >='A' && c <='Z'){
                   upper++;
               }else if( c >= 97 && c <= 122){
                   lower++;
               }else if( c >= 48 && c <='9'){
                   digit++;
               }
        }
        System.out.println(upper);//输出结果为：2
        System.out.println(lower);//输出结果为：3
        System.out.println(digit);//输出结果为：4
    }     
}

版权声明：本文为博主原创文章，转载请附上博文链接！