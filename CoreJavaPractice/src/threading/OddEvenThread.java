package threading;

public class OddEvenThread  {

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
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}	
		System.out.println("odd task..." + Thread.currentThread().getName());
		System.out.println("odd: "+number);
		isOdd = false; // Set flag to false to indicate it's even thread's turn
		notify(); // Notify the even thread to proceed
        try {
            Thread.sleep(4000); // Sleep to observe the behavior
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}
	
	
	synchronized void printEven(int number) {
		while(isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("even task..."+ Thread.currentThread().getName());
		System.out.println("even: " + number);	
		isOdd = true; // Set flag to true to indicate it's odd thread's turn
		notify();// Notify the odd thread to proceed	
		
        try {
            Thread.sleep(4000); // Sleep to observe the behavior
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
		System.out.println("odd task...Thread started with Name is: " + Thread.currentThread().getName());
		for(int i = 1; i < max; i+=2) {
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
		System.out.println("even task...Thread started with Name is: " + Thread.currentThread().getName());
		
		for(int i = 2; i< max; i+=2) {
			numberPrinter.printEven(i);
		}
			
	}
}