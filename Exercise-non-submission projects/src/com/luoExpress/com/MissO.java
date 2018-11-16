package com.luoExpress.com;


import java.util.Arrays;

public class MissO {
	public static void main(String[] args) {
	int[] nums = {1,3,2,4,5,7};
	
	for (int i = 0; i < nums.length; i++) {
	    System.out.println("array[" + i + "] = " + nums[i]);
	}
	
	Arrays.sort(nums);
	for (int i = 0; i <=nums.length; i++) {
		if (nums[i]!=(i+1)) {
	    System.out.println("miss"+" "+(i+1));
		}
	}
	}
}
		

	
	
	
	
	

	

