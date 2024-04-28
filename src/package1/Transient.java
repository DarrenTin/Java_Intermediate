package package1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient implements Serializable {
	String name;
	transient String place; // place = null
	
	public static void test() {
		Transient sObject = new Transient();
		sObject.name = "Meow";
		sObject.place = "Transient secretplace";
		
		try {
			FileOutputStream fos = new FileOutputStream("s.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sObject); // encrypted file is generated
			System.out.println("Transient file save at \"s.txt\"");
			fos.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
