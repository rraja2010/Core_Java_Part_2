
public class Ascii {
	public static void main(String ar[]) {
		byte ascii[] = { 65, 66, 67, 68, 69 };
		String s = new String(ascii);
		System.out.println(s);
		String s2 = new String(ascii, 2, 3);
		System.out.println(s2);
	}
}
