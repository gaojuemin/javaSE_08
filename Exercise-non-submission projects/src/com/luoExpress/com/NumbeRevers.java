package com.luoExpress.com;

public class NumbeRevers {
	public static void main(String[] args) {
		System.out.println(reverse(-123));
		System.out.println(reverse(123));
		System.out.println(reverse(1230000000));
	}

	public static int reverse(int num) {
		
		if ((num > 0) && (num % 10 != 0)) {
			String str = num + "";
			System.out.println(new StringBuffer(str).reverse().toString());
		} else if (num < 0) {
			num = num * -1;
			String str = num + "";
			System.out.println("-" + new StringBuffer(str).reverse().toString());
		} else if (num % 10 == 0) {

			while ((num / 10) % 10 == 0) {
				num = num / 10;
			}
			num = num / 10;
			String str = num + "";

			System.out.println(new StringBuffer(str).reverse().toString());
		}

		return 0;

	}

}
