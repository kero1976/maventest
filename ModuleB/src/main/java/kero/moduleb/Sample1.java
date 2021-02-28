package kero.moduleb;

public class Sample1 {
	public void bug() {
		String str = null;
		String str2;
		System.out.println(str);
		try {
			System.out.println(str.toString());
		}catch(Exception e) {
kero.A1.hoge();
		}

	}
}
