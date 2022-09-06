package coma.tostring;
class L {
	int i;

	L(int i) {
		this.i = i;
	}
	public String toString() {
		return "i=" + i;
	}
}

class M extends L {
	int j;

	M(int i, int j) {
		super(i);
		this.j = j;
	}
	public String toString() {
		return super.toString() + ",j=" + j;
	}
}

public class Manager10 {
	public static void main(String[] args) {
		L obj1 = new L(90);
		M obj2 = new M(2, 40);//
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("done");
	}
}
