package venkat;

class rice_seeds {
	void planting() {
		String first = "on earth";
		System.out.println(first);
	}
}
	class Growing extends rice_seeds {
	 void name() {
		
	}	void green() {

			String second = "cut the plant";
			System.out.println(second);
		}
	}


public class Inheritance_single {

	public static void main(String[] args) {
		
		Growing qas=new Growing();
		qas.planting();
		qas.green();	

	}

}
