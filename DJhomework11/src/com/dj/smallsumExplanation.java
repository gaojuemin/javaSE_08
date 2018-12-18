package com.dj;
//在一个数组中
public class smallsumExplanation {
	static int count = 1;//运行计数
	public static void main(String[] args) {
		
		//System.out.println(3 >> 1);
		int[] arr = { 1,4,2,6,3};
		//System.out.println(mergeSort(arr,0,18));
		System.out.println("结果"+mergeSort(arr,0,4));
	}
	public static int mergeSort(int[] arr, int l, int r) { 
		if (l == r) { //如果左边界等于右边界，程序返回0.
			return 0;//此方法功能用来分割数组。
		}
		int mid = l + ((r - l) >> 1); //数组中间index值。》》位运算除以2，结果取整0.5也舍去。
		System.out.println("---------mergeSort-----------");
		System.out.println("l="+l+" m="+mid+" r="+r);
		System.out.println("----------mergeSort----------");
		for(int j =l;j<=mid;j++) {
			System.out.println(arr[j]+" ");
		}
		System.out.println("%%%%%%%");
		for(int j =mid+1;j<=r;j++) {
			System.out.println(arr[j]+" ");
		}
		return mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r)+ merge(arr, l, mid, r);
	}
	/////////////////////
	
	public static int merge(int[] arr, int l, int m, int r) {
		System.out.println("merge方法初始条件"+" l="+l+" m="+m+" r="+r);
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;
		int p2 = m + 1;
		int res = 0; //结果累加值
		
		System.out.println("第"+count+"次");
		count++;
		while (p1 <= m && p2 <= r) {      
			res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;  
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= m) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (i = 0; i < help.length; i++) {
			arr[l + i] = help[i];
		}
		for (i = 0; i < help.length; i++) {
			System.out.print(" help["+i+"]="+help[i]);
		}
		System.out.println();
		System.out.println("res="+res);
		return res;
	}

}
