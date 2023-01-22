package datatypes_in_java;

class king extends Test{
	void m1() {
	int a=20;
	if(a%2==0 ) {
	System.out.println("Even Number");
	System.out.println(a+b);

	}
	else {
		System.out.println("Odd Number");
	}
}
}

public class Methods {
	
	
	void m2() {
		
		int x=10;
		int y=20;
		boolean z= true;
		System.out.println(x<y);
		System.out.println(z);
		
	}
	public static void main(String[] args) {
    king ks=new king();
    Methods ms=new Methods();
      ks.m1();
      ms.m2();
      Test az=new Test();
      az.m1();

     
      
	}

}

