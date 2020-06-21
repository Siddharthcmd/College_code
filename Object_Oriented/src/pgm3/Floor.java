package pgm3;

public class Floor {
	private double width, length;

	public Floor(double width, double length) {
		this.width = width < 0 ? 0 : width;
		this.length = length < 0 ? 0 : length;
	}

	public double getArea() {
		return this.length * this.width;
	}

	public class Carpet {

		private double cost;

		public Carpet(double cost) {
			this.cost = cost < 0 ? 0 : cost;
		}

		public double getCost() {
			return cost;
		}
	}

	public class Calculator {

		private Floor floor;
		private Carpet carpet;

		public Calculator(Floor floor, Carpet carpet) {
			this.floor = floor;
			this.carpet = carpet;
		}

		public double getTotalCost() {
			return this.floor.getArea() * this.carpet.getCost();
		}
	}
}
