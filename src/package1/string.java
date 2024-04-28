package package1;

public class string {
	static void string_test() {
		// must be double quotation mark ""
//		String companyName = new String();
//		companyName = "Yamaha";
//		String companyName = new String("Tokyo");
		String companyName = "Daifuku";
		System.out.println(companyName);
		
		// string format, format specifier
		int year = 1937; // %d
		String place = "Osaka"; // %s
		String desc = "leading material handling system supplier in the world";
		double revenue = 3.8; // %f
		char percentSign = '%'; // %c
		boolean truth = true; // %b
		
		String formattedString = 
				String.format("%s is a Japanese company, founded at %s in %d. "
				+ "\nIt is a %s."
				+ "\nRevenue in 2018 is %.2f million (%f1234) USD."
				+ "\n100%c of information here is %b.", 
				companyName, place, year, desc, revenue, revenue, percentSign, truth);
		System.out.println(formattedString);
		System.out.println("Length: " + formattedString.length());
		System.out.println("IsEmpty: " + formattedString.isEmpty());
		System.out.println("Contains: " + formattedString.contains("Daifuku"));
		System.out.println(" ".isEmpty()); // empty is ""
		System.out.println(" ".isBlank()); // blank is " \t\n"
		System.out.println(companyName.toUpperCase());
		System.out.println(companyName.toLowerCase());
		String newFormattedString = formattedString.replace("company", "international organization");
		newFormattedString = newFormattedString.replace("2018", "2024");
		newFormattedString = newFormattedString.replace("3.8", "8.3");
		System.out.println(newFormattedString);

	}
}
