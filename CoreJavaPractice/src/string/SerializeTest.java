package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) throws IOException {

		Student studObj = new Student(1, "jay");

		// here stuObj is an Object of Student class

		// Serialization

		try {

			File file = new File("C:/WorkSpace/training/basic-code-practice/src/serializable/file.txt");

			FileOutputStream fout = new FileOutputStream(file); // FileOutStream class is used to writing or store data/stream of bytes to file.
			ObjectOutputStream out = new ObjectOutputStream(fout); // whole purpose is to provide us a way to convert java object to a stream.

			out.writeObject(studObj);

			out.flush();
			out.close();

			System.out.println("successfuly serialize the object");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// De-Serialization

		try {
			File file2 = new File("C:/WorkSpace/training/basic-code-practice/src/serializable/file.txt");

			FileInputStream fin = new FileInputStream(file2);
			ObjectInputStream in = new ObjectInputStream(fin);

			Student studOutObj = (Student) in.readObject();

			System.out.println("Deserialize successfully");
			System.out.println(studOutObj.id + " and " + studOutObj.name);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
