package venkat;

    class Over_load {
	
	 void xaxis() {
		double a=1.2;
		char b='^';
		//System.out.println("a:"+a);
		//System.out.println("b:"+b);
		System.out.println(a+b);
		
	}
	   void xaxis(String x) {
		   double c=-1.2;
		   double d=-3.2;
		   System.out.println("c:"+c);
		   System.out.println("d:"+d);
		   System.out.println(x);
		   
	   }
	public static void main(String[] args) {
		Over_load wsw=new Over_load();
		
		wsw.xaxis();
		wsw.xaxis("king");

	}

}
