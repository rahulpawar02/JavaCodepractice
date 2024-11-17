package designpatterns.singleton;

//This class for Added the Double check Locking for singleton instance in multithreaded envrionment
public class Singleton1 {

	private static Singleton1 instance;
	
	private Singleton1() {
		
	}
	
	public static Singleton1 getInstance() {

		if (instance == null) {
			synchronized (Singleton1.class) {
				if (instance == null) {
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
	
	public void testDobulecheckMethod() {
		System.out.println("singleton double check method");
	}
}
