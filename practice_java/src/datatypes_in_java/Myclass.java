package datatypes_in_java;

class Test{
	
	int b=12;
	void m1() {
		
		int i=12;
		System.out.println(i);
	}
	void m2() {
		
		
		int c=24;
		int d=b+c;
		System.out.println(d);
	}	
	void m3() {
		
		int f=95;
		int h=15;
		System.out.println(f*b);
		System.out.println(h+b);
		
	}
}
public class Myclass {
	
	void m3() {
		
			int a=10;
			System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Test ts=new Test();
		ts.m1();
		ts.m2();
		ts.m3();
		Myclass mc=new Myclass();
		mc.m3();
	
	}
}		
	
