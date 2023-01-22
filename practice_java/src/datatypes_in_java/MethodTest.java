package datatypes_in_java;


class Demo{
	
	void m1() {
		
		System.out.println("Method1");
	}
}
public class MethodTest {

	void m2() {
		
		System.out.println("Method2");
	}
	
	public static void main(String[] args) {

		Demo t=new Demo();
		t.m1();
		MethodTest mt=new MethodTest();
		mt.m2();
	}

}





































