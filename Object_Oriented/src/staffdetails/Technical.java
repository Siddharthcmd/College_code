package staffdetails;

public class Technical extends Staff {
	private String skills;

	public Technical(String staffId, String name, float salary, String phoneNumber, String skills) {
		super(staffId, name, salary, phoneNumber);
		this.skills = skills;
	}

	public String toString() {
		return super.toString() + "\t" + "SKILLS: " + skills;
	}
}
