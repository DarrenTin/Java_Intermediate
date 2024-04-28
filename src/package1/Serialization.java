package package1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Serialization implements Serializable {
	String name;
	String place;
	
	static void test() {
		Serialization sObject = new Serialization();
		sObject.name = "Dog";
		sObject.place = "Intel";
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Name: ");
//		sObject.name = scan.nextLine();
//		System.out.println("Place: ");
//		sObject.place = scan.nextLine();
		
		try {
			FileOutputStream fos = new FileOutputStream("s.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sObject); // encrypted file is generated
			System.out.println("Serialized file save at \"s.txt\"");
			fos.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
