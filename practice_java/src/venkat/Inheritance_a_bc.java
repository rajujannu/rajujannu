package venkat;

class First2 {

	void plant() {
		int x = 1;
		System.out.println(x);
	}
}

class Secn extends First2 {
	void seed() {
		int b = 2;
		System.out.println(b);
	}
}

class Thr extends First2 {
	void eat() {
		int c = 3;
		System.out.println(c);
	}
}

public class Inheritance_a_bc {

	public static void main(String[] args) {

		Secn qwe = new Secn();
		qwe.seed();
		qwe.plant();
		Thr qaz = new Thr();
		qaz.eat();
		qaz.plant();

	}

}
