package venkat;

public class Non_staticData_inside_class {
	
	void done() {
      int z=12;
      int x=32;
      System.out.println(z+x);
	}
	void d1() {
		int a=8;
		int b=9;
		System.out.println(a-b);	
	}
	public static void main(String[] args) {
		
		 Non_staticData_inside_class qaz=new  Non_staticData_inside_class();
		 qaz.done();
		 qaz.d1();    
	}

}
