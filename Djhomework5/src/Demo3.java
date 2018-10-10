/*
 * 分析以下需求，并用代码实现：
	(1) 计算15+25+35+....+1005的和


效果:
51005
*/
public class Demo3 {
	public static void main(String[] args) {
		int sum=0;
		for (int i=15;i<=1005;i=i+10) {
			sum = i+sum;
		}
		System.out.println(sum);
	}

}
