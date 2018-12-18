package com.dj;
//小和问题。在一个数组中，每一个数左边比当前数小的数累加起来。
public class SmallSum {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 5 };
		int[] arr1 = { 1, 3, 4, 2, 5, 0 };
		System.out.println(smallsum(arr));
		System.out.println(smallsum(arr1));
		System.out.println(smallSum1(arr1));
	}

	//plan A
	public static int smallsum(int[] arr) {
		int sum = 0;
		if (arr.length == 1) {
			return arr[0];
		}
		if (arr == null) {
			return 0;
		}
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					sum = sum + arr[j];
				}
			}
		}
		return sum;
	}
	//递归法，思想找左边小的数相加，就是找此数字右边的比他大的数的个数乘以此数。
	//{ 1, 3, 4, 2, 5 };1*4+3*2+4*1+2*1
	public static int smallSum1(int[] arr) {
		if (arr == null || arr.length < 2) {  //数组空或只有1位元素，返回0
			return 0;
		}
		return mergeSort(arr, 0, arr.length - 1);  //调用 mergeSort
	}

	public static int mergeSort(int[] arr, int l, int r) { 
		if (l == r) { //如果左边界等于右边界，程序返回0.
			return 0;//
		}
		int mid = l + ((r - l) >> 1); //数组中间index值。》》位运算除以2，结果取整0.5也舍去。
		return mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r) + merge(arr, l, mid, r);
	}

	public static int merge(int[] arr, int l, int m, int r) {
		int[] help = new int[r - l + 1]; //定义一个中转数组
		int i = 0; 
		int p1 = l; //左边界为P1
		int p2 = m + 1; //中间标识+1为P2，P2移动
		int res = 0; //累加值为res
		while (p1 <= m && p2 <= r) {
			res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;//实现乘法的语句。
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
		return res;
	}
}