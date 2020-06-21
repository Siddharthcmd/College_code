package constructor;

public class Shirt {

	public static String color;
	public static String size;

	Shirt() {}
	Shirt(String newColor, String newSize){
		color =newColor;
		size = newSize;
	}

	public static void putOn() {
		System.out.println("shirt is on");
	}

	public static void takeOff() {
		System.out.println("shirt is off");
	}

	public static void setColor(String newColor) {
		color = newColor;
	}

	public static void setSize(String newSize) {
		size = newSize;
	}

}
