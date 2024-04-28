package package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	static void test() {
		try {			
			FileInputStream fis = new FileInputStream("s.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization ss = (Serialization) ois.readObject();
//			Transient ss = (Transient) ois.readObject();
			System.out.println("Name: " + ss.name);
			System.out.println("Location: " + ss.place);
			fis.close();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (ClassCastException cc) {
			Transient_Handling();
		}
	}
		
	static void Transient_Handling() {
		try {			
			FileInputStream fis = new FileInputStream("s.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
//			Serialization ss = (Serialization) ois.readObject();
			Transient ss = (Transient) ois.readObject();
			System.out.println("Name: " + ss.name);
			System.out.println("Location: " + ss.place);
			fis.close();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
	}
}
