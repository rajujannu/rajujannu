package venkat;

class overload {

	void m1() {
		for (int d = 1; d <= 10; d++) {
			System.out.println("pr class:" + d);
		}
	}
}

class overload1 extends overload {
	void m1() {
		int d = 10;
		while (d >= 1)
		{
			System.out.println("ch class:" + d);
			d--;
		}
		super.m1();
	}
}

public class Method_over_rading {

	public static void main(String[] args) {
		overload1 wew = new overload1();
		wew.m1();
		
		
		//overload rer= new overload();
		//rer.m1();

	}

}
