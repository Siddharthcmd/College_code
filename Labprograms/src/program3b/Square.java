package program3b;

public class Square implements Runnable {
	public int x;

	public Square(int x) {
		this.x = x;
	}

	public void run() {
		System.out.println("From Second thread - Square of " + x + " is: " + x * x);
	}
}
