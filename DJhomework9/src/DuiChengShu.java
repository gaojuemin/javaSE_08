/*分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数
	*/
public class DuiChengShu {
	public static void main(String[] args) {
		String[] str1 = { "010", "3223", "666", "7890987", "123123"};
		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equals(new StringBuffer(str1[i]).reverse().toString())) {
				//对称数是正序和反序一样，所以数组与自己的反序比较，一样就记对称。
				System.out.println(str1[i] + "是对称的");
				c1++;
			} else if (true){
				System.out.println(str1[i] + "不是对称的");
				c2++;
			}
		}
		System.out.println("对称的数有" + c1 + "个" + "  " + "不是对称的有" + c2 + "个");

	}

}
