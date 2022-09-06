package com.tricky01;

public class B {
	public static void main(String[] args) {
		long longWithL = 1000 * 60 * 60 * 24 * 365L;
		long longWithoutL = 1000 * 60 * 60 * 24 * 365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
	}
}
/*
Output:
31536000000
1471228928

How ?
In case of the first variable, we are explicitly creating it as 
	long by placing an �L� at the end, so the compiler will treat 
	this at long and assign it to the first variable.

In the second case, the compiler will do the calculation and 
	treat it as a 32-bit integer, since the output is outside the 
		range of integer max value (2147483647), the compiler will 
		truncate the most significant bits and then assign it to the variable.

Binary equivalent of 1000*60*60*24*365L = 011101010111101100010010110000000000 (36 bits)
Removing 4 most significant bits to accommodate in 32-bit int, 
	value = 01010111101100010010110000000000 (32 bits)
Which is equal to 1471228928 and hence the output


*/