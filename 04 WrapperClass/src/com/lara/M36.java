package com.lara;

public class M36 {
	static void test(Integer obj) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		int i = 20;
		Integer obj = new Integer(20);
		test(i);
		test(obj);

	}
}
