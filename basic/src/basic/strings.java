package basic;

public class strings {
	public static void main(String[] args) {
		String BookTitle;
		String StringSearch = "Ring";
		BookTitle = "Lord of the Rings";
		
		if (BookTitle.contains(StringSearch)) {
			System.out.println("The book title contains " + StringSearch);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is " + browser);
		}
		
		String FirstName = "Chris";
		String LastName = "Salazar";
		String SSN ="7823828092";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		
		System.out.print(FirstName.substring(0, 1));
		System.out.print(LastName.substring(0, 1));
		System.out.println(SSN.substring(5));
		
		
		
		
	}
}
