package threading;
//Write a program using two threads print even and odd number simultaneously

public class OddEvenThread {

	public static void main(String[] args) {

		NumberPrinter nmObj = new NumberPrinter();
		int max = 10;

		Thread oddThread = new Thread(new OddTask(nmObj, max));
		Thread evenThread = new Thread(new EvenTask(nmObj, max));
		oddThread.start();
		evenThread.start();
	}

}

class NumberPrinter {

	private boolean isOdd = true;
	
	synchronized void printOdd(int number) {
		while (!isOdd) {
			waitSafely();
		}
		System.out.println("odd: " + number);
		isOdd = false; // Set flag to false to indicate it's even thread's turn
		notify(); // Notify the even thread to proceed
	}

	synchronized void printEven(int number) {
		while (isOdd) {
			waitSafely();
		}
		System.out.println("even: " + number);
		isOdd = true; // Set flag to true to indicate it's odd thread's turn
		notify();// Notify the odd thread to proceed
	}

	private void waitSafely() {
		try {
			wait();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

class OddTask implements Runnable {

	private final NumberPrinter numberPrinter;
	private final int max;

	OddTask(NumberPrinter numberPrinter, int max) {
		this.numberPrinter = numberPrinter;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 1; i < max; i += 2) {
			numberPrinter.printOdd(i);
		}

	}
}

class EvenTask implements Runnable {

	private final NumberPrinter numberPrinter;
	private final int max;

	EvenTask(NumberPrinter numberPrinter, int max) {
		this.numberPrinter = numberPrinter;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 2; i < max; i += 2) {
			numberPrinter.printEven(i);
		}

	}
}