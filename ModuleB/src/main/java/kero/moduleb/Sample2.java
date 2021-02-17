package kero.moduleb;

public class Sample2 {
	public void bug() {
		String str = null;
		String str2;
		System.out.println(str);
		try {
			System.out.println(str.toString());
		}catch(Exception e) {

		}

	}
}
