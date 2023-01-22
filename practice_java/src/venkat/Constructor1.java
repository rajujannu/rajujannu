package venkat;

public class Constructor1 {
	
	Constructor1(char x){
		
		this("raju");
		System.out.println(x);
	}
	Constructor1(String y){
		
		this(12);
		System.out.println(y);
	}
	Constructor1(int k){
	
		this();
		System.out.println(k);
	}
	Constructor1(){
		this(12.23);
			 
		System.out.println("jannu");
		System.out.println("fghjkjh"); 
	}
	Constructor1(double k){
		
		System.out.println(k);
	}
	

	public static void main(String[] args) {
		
	Constructor1 a=new Constructor1('@');
	
	}

}
