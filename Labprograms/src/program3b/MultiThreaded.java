package program3b;

public class MultiThreaded {

	public static void main(String[] args) {
		try {
			Thread t1 = new Thread(new RandomThread());
			t1.start();
			int num = 10;
			Thread t2 = new Thread(new Square(num));
			t2.start();
			Thread t3 = new Thread(new Cube(num));
			t3.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
