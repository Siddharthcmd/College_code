package pgm3;

public class Cylinder extends Circle {
	double hight;

	public Cylinder(double radius, double hight) {
		super(radius);
		if (hight < 0) {
			this.hight = 0;
		} else {
			this.hight = hight;
		}
	}

	public double getHight() {
		return hight;
	}

	public double getVolume() {
		return getArea() * getHight();
	}

}
