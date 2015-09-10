import java.util.Date;

public class ThreadSample {
	public static void main(String[] args) throws InterruptedException {
		CounterThread counterThread = new CounterThread();
		counterThread.start();

		
		Thread reverseThread = new Thread(new ReverseCounterRunnable());
		reverseThread.start();
		
		
		new Thread(new DataPrinter()).start();
		
		Thread.sleep(1000000);
		
	}
}

class CounterThread extends Thread {

	public CounterThread() {
		// TODO Auto-generated constructor stub
		super("CounterThread");
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class ReverseCounterRunnable implements Runnable {

	public void run() {
		for (int i = 100; i >= 1; i--) {
			System.out.println("Reverse counter " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class DataPrinter implements Runnable {
	
	private boolean canRun = true;
	
	public void run() {
		while(true) {
			System.out.println(new Date());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void stop() {
		canRun = false;
	}
}