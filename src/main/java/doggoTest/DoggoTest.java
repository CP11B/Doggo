package doggoTest;

public class DoggoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doggoPlacement(10));
		
	}
	
	
	public static String doggoPlacement(int place) {
		String is = "";
		for (int i=1; i <= 100; i++) {
					
					if (i == place) {
						continue;
					} 
					
					if (i % 10 == 1 && i != 11) {
						//System.out.println(i + "st");
						is += i + "st, ";
					} else if (i % 10 == 2 && i != 12) {
						//System.out.println(i + "nd");
						is += i + "nd, ";
					} else if (i % 10 == 3 && i != 13) {
						//System.out.println(i + "rd");
						is += i + "rd, ";
					} else {
						//System.out.println(i + "th");
						is += i + "th, ";
					}	
					
				}
		return is;
			}

}
