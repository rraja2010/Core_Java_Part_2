package com.lara;

public class M38 {
	static void test(double d1) {
		System.out.println("double");
	}

	static void test(Integer obj) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		int i = 20;
		test(i);
		test(Integer.valueOf(i));
		test(Double.valueOf(i).doubleValue());
		test(Double.valueOf(Integer.valueOf(i)).doubleValue());
	}
}
