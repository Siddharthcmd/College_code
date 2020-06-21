package objOri;

public class Stud {

	public static void main(String[] args) {
		Student ss = new Student("ww", 100);
		Student dd = new Student("ff", 101);

		dd.showDetails();
		ss.showDetails();
		System.out.println(Student.total);

	}
}

class Student {
	private String name;
	private int roll;
	public static int total = 0;

	Student(String n, int r) {
		this.name = n;
		this.roll = r;
		Student.total++;
	}

	public void showDetails() {
		System.out.println(this.name + " " + this.roll);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
