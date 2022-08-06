package synchronization;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"rahul");
		MyThread t2 = new MyThread(d,"rohit");
		t1.start();
		t2.start();

	}

}
