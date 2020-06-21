package pgm3;

public class VipCustomer {
	private String name;
	private int creditLimit;
	private String emailAddress;

	public VipCustomer() {
		this("sid", 5000, "sid@gmail.com");
	}

	public VipCustomer(String name, int creditLimit) {
		this(name, creditLimit, "sid@gmail.com");
	}

	public VipCustomer(String name, int creditLimit, String emailAddress) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
