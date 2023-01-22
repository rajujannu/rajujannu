package venkat;

class p1{
	
	void raju71() {
		int a=15;
		int b=10;
		System.out.println(a+b);
	}
}
   public class Over_overriding extends p1{
	void raju71() {
		int c=10;
		int d=18;
		System.out.println(c+d);
		super.raju71();
	}
	public static void main(String[] args) {
		Over_overriding wsx=new Over_overriding();
		wsx.raju71();

	}

}
