/*
 * 	A:二维数组遍历获取到每一个值

	B:公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99

 */
public class Demo9 {
	public static void main(String[] args) {
		int arr[][] = new int [4][3];
		arr[0]=new int[] {22,66,44};
		arr[1]=new int[] {77,33,88};
		arr[2]=new int[] {25,45,65};
		arr[3]=new int[] {11,66,99};
		
		int sum = 0;
		System.out.print("全年各销售额为 ");
		for (int i=0;i<arr.length;i++) {   // 遍历数组元素
			for(int j=0;j<arr[i].length;j++) {   // 遍历小组内每个人的销售额
				System.out.print(arr[i][j]+"万元 ");
				sum = sum + arr[i][j];      //累加各销售额
			}
		}
		System.out.println();
		System.out.print("全年各销售总额为"+sum+"万元");
	}
}
