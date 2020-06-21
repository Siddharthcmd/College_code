package composition;

public class Bedroom {
	private String name;
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Bed bed;
	private Cealing cealing;
	private Lamp lamp;

	public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Cealing cealing, Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.bed = bed;
		this.cealing = cealing;
		this.lamp = lamp;
	}

	public Lamp getLamp() {
		return this.lamp;
	}

	public void makeBed() {
		System.out.println("bed--> making the bed");
		bed.make();
	}

}
