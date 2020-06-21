package staffdetails;

public class Teaching extends Staff {
	private String domain;
	private String publication;

	public Teaching(String staffId, String name, float salary, String phoneNumber, String domain, String publication) {
		super(staffId, name, salary, phoneNumber);
		this.domain = domain;
		this.publication = publication;
	}

	public String toString() {
		return super.toString() + "\t" + "DOMAIN: " + domain + "\t" + "Publications:" + publication;
	}

}
