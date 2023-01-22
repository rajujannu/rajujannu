package venkat;

class First1 extends First2 {

	void Data() {
		int a = 05;
		System.out.println(a);
        
	}
}

class Second extends First1 {
	void Months() {
		String b = "Jan";

		System.out.println(b);
	}
}

class Third extends First1 {
	void year() {
		int c = 2023;
		System.out.println(c);
	}
}

public class Inheritance_ab {

	public static void main(String[] args) {
		First1 qwq=new First1();
		qwq.Data();
		qwq.plant();
	}
}
