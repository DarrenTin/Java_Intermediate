package package1;

enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
    private String rgbValue;

    Color(String rgbValue) {
        this.rgbValue = rgbValue;
    }

    String getRGB() {
        return rgbValue;
    }
}

public class Enum {
	static void test() {
//		Color c1 = Color.RED;
//		Color c2 = Color.GREEN;
//		Color c3 = Color.BLUE;
		
		for(int i = 0; i < Color.values().length; i++) {
			Color c = Color.values()[i];
			System.out.println("Chosen: " + Color.values()[i]);
			System.out.println("Name: " + c.name());
			System.out.println("Ordinal: " + c.ordinal());
			System.out.println("RGB: " + c.getRGB() + "\n");
		}
	}
}
