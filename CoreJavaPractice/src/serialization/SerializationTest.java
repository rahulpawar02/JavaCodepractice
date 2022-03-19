package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {

		String fileName = "employee.txt";
		serializeObject(fileName);
		deSerializeObject(fileName);

	}

	//Serialization.........	
	public static void serializeObject(String fileName) {
		Address addressObj = new Address(1, "addressline1", "addressline2", "pune", 411046);
		Employee employee = new Employee(101, "aditya", 24, "adi@gmail.com", "12345", addressObj);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
			oos.writeObject(employee);
			System.out.println("Object is serialized......");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DeSerialization.........
	public static void deSerializeObject(String fileName) {
		
		try(ObjectInputStream ooi = new ObjectInputStream(new FileInputStream(new File(fileName)))){
			Object object = ooi.readObject();	
		    Employee employee = (Employee) object;
		    System.out.println("object is De-serialized....");
		    System.out.println(employee);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
