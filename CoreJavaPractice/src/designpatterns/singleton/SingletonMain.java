package designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton singletonObj = Singleton.getInstance();
		singletonObj.testMethod();
		
		//comipler error when you try to create object outside of singleton class for test uncomment this below line
		//Singleton singletonNewObj = new Singleton();
	}
}
