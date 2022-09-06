package com.clone;

public class F {
	int i;
}

class G implements Cloneable {
	F f1;
	int j;

	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		G g1 = (G) obj;
		g1.f1 = new F();
		g1.f1.i = f1.i;
		return g1;
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		G g1 = new G();
		g1.f1 = new F();
		g1.f1.i = 10;
		g1.j = 20;

		G g2 = (G) g1.clone();
		g2.f1.i = 40;
		g2.j = 50;
		System.out.println(g1.f1.i);
		System.out.println(g1.j);
	}
}
