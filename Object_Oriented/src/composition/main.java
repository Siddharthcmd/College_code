package composition;

public class main {

	public static void main(String[] args) {
		Wall wall1 = new Wall("east");
		Wall wall2 = new Wall("west");
		Wall wall3 = new Wall("north");
		Wall wall4 = new Wall("south");

		Bed bed = new Bed("modern", "3");

		Cealing cealing = new Cealing("white", 9);

		Lamp lamp = new Lamp("vintage", false, 75);

		Bedroom bedroom = new Bedroom("Siddharth", wall1, wall2, wall3, wall4, bed, cealing, lamp);
		
		bedroom.makeBed();
		
		bedroom.getLamp().turnOn();

	}

}
