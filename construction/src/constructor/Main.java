package constructor;

public class Main {

	public static void main(String[] args) {

		Shirt s = new Shirt("black", "M");
//		s.setColor("white");
//		s.setSize("M");
//		s.putOn();

		System.out.println(s.color);
		System.out.println(s.size);

	}

}
