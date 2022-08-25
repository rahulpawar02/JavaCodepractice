package oops;

class A {
	public void m1(int a) {
		System.out.println("aaaa");
	}
}

class B extends A {

	public void m1(String s) {
		System.out.println("sss");
	}
}

public class OverloadintTest {
	public static void main(String[] args) {
		B b = (B) new A();

	}
}
