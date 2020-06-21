package pgm3;

public class Bedroom {
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private wall wall4;
	private Cealing cealing;
	private Bed bed;
	private Lamp lamp;

	public Bedroom(Wall wall1, Wall wall2, Wall wall3, wall wall4, Cealing cealing, Bed bed, Lamp lamp) {
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.cealing = cealing;
		this.bed = bed;
		this.lamp = lamp;
	}

	public Lamp getLamp() {
		return this.lamp;
	}

	public Bed makeBed() {
		System.out.println("bedroom---> making bed ");
		bed.make();
	}

}
