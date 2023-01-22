package datatypes_in_java;

public class Ifelse  extends Forloop{

	public static void main(String[] args) {

    	int a=20;
    	if (a%2==0)
    	{
    			System.out.println("Even Number");		
    	
    	}
    	else  
    	{
    			System.out.println("odd Number");
    
    	 }
    	
    	int x=100;
    	int y=200;
    	if (x>y)
    	{
    		System.out.println("a is big value");
    	}
    	else 
    	  {
            System.out.println("b is big value");
	      }
    	
    	int q=10; int w=50; int e=30; int r=20;
    	
    	if (q>w&q>e&q>r)
    	{
    		System.out.println("q is big value");
    	} else if(w>e&w>r)
    	{
    		System.out.println("w is big value");
    	}else if (e>r)
    	{
    	System.out.println("e is big value");	
    	}
    	else
    	{
    		System.out.println("r is big value");
    	} 
    	
   }
}
        

