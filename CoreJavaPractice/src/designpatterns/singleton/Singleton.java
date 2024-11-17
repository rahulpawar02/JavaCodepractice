package designpatterns.singleton;

public class Singleton {
	
	private static Singleton instance;
	
	 // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialization code (if needed)
    }
    
    // Public method to provide the single instance of the class
	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void testMethod() {
		System.out.println("singleton method");
	}
	
}
