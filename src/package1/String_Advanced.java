package package1;

public class String_Advanced {
	static void test_interning() {
		String s1 = "hello"; // added to string pool
		String s2 = new String("hello").intern(); // interning 
		String s3 = "hello"; // reference to the same string

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
	
	static void test_stringbuilder() { // single threading
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("012");
		stringBuilder.append("567");
		stringBuilder.insert(3, "gggg"); // at exact index
		System.out.println(stringBuilder);
		stringBuilder.delete(6, 8); // 6 <= x < 8
		System.out.println(stringBuilder);
		stringBuilder.replace(0, 1, "89"); // 0 <= x < 1
		System.out.println(stringBuilder);
	}
	
	static void test_stringbuffer() { // multi-threading
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("012");
		stringBuffer.append("567");
		stringBuffer.insert(3, "gggg"); // at exact index
		System.out.println(stringBuffer);
		stringBuffer.delete(6, 8); // 6 <= x < 8
		System.out.println(stringBuffer);
		stringBuffer.replace(0, 1, "89"); // 0 <= x < 1
		System.out.println(stringBuffer);
	}
	
	static void test_comparision() {
		String str1 = "hello";
		String str2 = "HELLO";
		
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true
		System.out.println(str1.compareTo(str2)); // 32
		System.out.println(str1.compareToIgnoreCase(str2)); // 0
		System.out.println(str1.startsWith("hel")); // true
		System.out.println(str1.endsWith("llo")); // true
		System.out.println(str2.contains("bello")); // false
	}
}
