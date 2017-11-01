package basic;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare and define the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] =  "Ohaio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println(states[0]);
		
 		// Declare array
		
		String[] countries;
		
		// Define the array
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Philippines";
		countries[2] = "Japan";		
		
		System.out.println("************Do*******************");
		int i=0;
		
		
		// do loop
		do {
		System.out.println(states[i]);
		i = i+1;
		}while(i <5);
		
		System.out.println("************While*******************");
		
		// while loop
		int n=0;
		
		while(n <= 4) {
			System.out.println(states[n]);
			n++;
		}
		
		System.out.println("************FOR*******************");
		
		//for loop

		for (int x = 0; x<5; x++) {
			System.out.println(states[x]);
		}
		
		
		
		
		
	}

}
