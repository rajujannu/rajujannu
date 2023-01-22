package venkat;

class xone {

	static int x = 30;

	    void raju() {
		int y = 18;
		int z = 13;
		System.out.println(y * z + (+x));
	}

	    void m2() {
		int a = 3;
		int b = 4;
		System.out.println(a - b);
	}

	static void m3() {
		int q = 15;
		int s = 6;
		System.out.println(q + s + (+x));
	}

}

public class StaticData_Out_side_class {
	public static void main(String[] args) {
		System.out.println(xone.x);
		
		xone.m3();
		xone qwe=new xone();
		qwe.m2();
		qwe.raju();

	}

}
