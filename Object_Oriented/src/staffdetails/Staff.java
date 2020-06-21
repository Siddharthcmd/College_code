package staffdetails;

public class Staff {
	protected String staffId;
	protected String name;
	protected float salary;
	protected String phoneNumber;

	public Staff(String staffId, String staffName, float staffSalary, String staffPhoneNumber) {
		this.staffId = staffId;
		this.name = staffName;
		this.salary = staffSalary;
		this.phoneNumber = staffPhoneNumber;
	}

	public String toString() {
		return "STAFF ID: " + staffId + "\t" + "NAME: " + name + "\t" + "SALARY: " + salary + "\t" + "PHONENUMBER: "
	    + phoneNumber;
	}

}
