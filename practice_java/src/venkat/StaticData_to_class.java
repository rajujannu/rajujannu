package venkat;

public class StaticData_to_class {
    static int Y=20;
    
     void m1() {
   	 
   	 int a=10;
   	 int b=20;
   	 System.out.println(a+b);
   	 
   }
      static void m2() {
    	
       int c=15;
       int d=18;
       System.out.println(c*d);	
    }
    
	public static void main(String[] args) {
		System.out.println(Y);
		StaticData_to_class tgb=new StaticData_to_class();
		tgb.m1();
            m2();
		
      }

}


