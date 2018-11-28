package exercisedemon;

import java.util.ArrayList;
import java.util.Arrays;

public class testkjj {
	public static void main(String[] args) {
		int[] x = {-8,-7,-6,0};
		System.out.println(maximumproduct(x));
	}
	public static int maximumproduct(int[] nums) {
		int max = 0;
		Arrays.sort(nums);
		int max1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		int max2 = nums[0]*nums[1]*nums[nums.length-1];
		if (max1>max2) {
			return max1;
		}
		return max2;
		
	}
	}

