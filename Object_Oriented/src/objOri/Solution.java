package objOri;

class arm {
	public  int add1(int x, int y) {
		return (x + y);
	}

}

class Adder extends arm{

	public  int add(int a, int b) {
		arm f= new arm();
		return f.add1(a, b);

	}

}

public class Solution {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}
