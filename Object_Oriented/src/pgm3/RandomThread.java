package pgm3;

import java.util.*;

public class RandomThread implements Runnable {
	public void run() {
		int num;
		Random r = new Random();
		try {
			for (int i = 0; i < 5; i++) {
				num = r.nextInt(100);
				System.out.println("First Thread Started and Generated Number is " + num);
				Thread.sleep(100);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
