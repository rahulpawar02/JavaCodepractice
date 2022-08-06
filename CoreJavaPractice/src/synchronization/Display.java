package synchronization;

public class Display {

	//synchronized method (which not allowed another thread to execute this method simultaneously)
	public synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread {
	Display d;
	String name;
	
	//constructor of MyThread class with Display class object and name property
	MyThread(Display d, String name){
		this.d = d;
		this.name = name;
	}
	
	//thread run() method
	public void run() {
		d.wish(name);
	}
}
