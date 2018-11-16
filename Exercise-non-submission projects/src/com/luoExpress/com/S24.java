package com.luoExpress.com;

public class S24 {
	public static void main(String[] args) {
		int[] nums = { 2, 7,14, 15 };
		int target = 9;
		for (int i = 0; i <= nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == (nums[i] + nums[j])) {
					System.out.println("nums第" + i + "位" + nums[i] + " " + "nums第" + j + "位" + nums[j]);

				}
			}
		}

	}
}
