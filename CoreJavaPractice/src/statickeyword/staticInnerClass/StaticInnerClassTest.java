package statickeyword.staticInnerClass;

public class StaticInnerClassTest { // Let's consider StaticInnerClassTest is outer class

	static int a =10;
	
	
	public static void display(){
		System.out.println("outer class static method");
	}
	
	static class Inner { // this is static inner class
		Inner() { // yes we can create the contructor of static inner class

			System.out.println("static inner class constructor is called..");
			System.out.println("we can access Outer class static variables:"+ a);
		}
		
		public void test() {
			display(); //inside static class we can access the static methods.
			System.out.println("static inner class test method");
		}
	}
	
	public static void main(String[] args) {
		// yes we can create the Object of Static Inner class through Outer class
		StaticInnerClassTest.Inner sinnObj = new StaticInnerClassTest.Inner();
		sinnObj.test();
	}
}
