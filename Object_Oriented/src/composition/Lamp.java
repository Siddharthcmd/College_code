package composition;

public class Lamp {
	private String style;
	private boolean battery;
	private int power;

	public Lamp(String style, boolean battery, int power) {
		this.style = style;
		this.battery = battery;
		this.power = power;
	}

	public void turnOn() {
		System.out.println("turn on the lamp");
	}

	public String getStyle() {
		return style;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getPower() {
		return power;
	}

}
