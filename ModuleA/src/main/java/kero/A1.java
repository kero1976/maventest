package kero;

public class A1 {

	public static void hoge() {
		System.out.println("AA");
		System.out.println("AA");
		System.out.println("AA");
		System.out.println("AA");
	}

	public static void hoge2() {
		System.out.println("AA");
		System.out.println("AA");
		System.out.println("AA");
		System.out.println("AA");
	}


	public void bug() {
		String str = null;
		String str2;
		System.out.println(str);
		System.out.println(str.toString());
	}
}
