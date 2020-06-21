package staffdetails;

public class Contract extends Staff {
	private String period;

	public Contract(String staffId, String staffName, float staffSalary, String staffPhoneNumber, String period) {
		super(staffId, staffName, staffSalary, staffPhoneNumber);
		this.period = period;
	}

	public String toString() {
		return super.toString() + "\t" + "Period: " + period;
	}
}
