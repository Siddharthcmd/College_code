package sid;

import java.util.concurrent.TimeUnit;

class B implements Runnable {
	public void run() {
		System.out.println("B class started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("B class over.");
	}
}

class E implements Runnable {
	public void run() {
		System.out.println("E class started");
		try {
			Thread.sleep(3000);
		} catch (Exception ex) {
			System.out.println("Hi");
			System.out.println("you got the exception " + ex.getMessage());
			Thread.currentThread().interrupt();
		}
		System.out.println("E class over.");
	}
}

class D implements Runnable {
	public void run1() {
		System.out.println("D class started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("D class over.");
	}
}

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new B());
		t1.start();
		Thread t2 = new Thread(new E());
		t2.start();
		Thread t3 = new Thread(new D());
		t3.start();

	}

}
