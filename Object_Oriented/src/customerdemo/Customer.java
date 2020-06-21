package customerdemo;

import java.util.StringTokenizer;

public class Customer {
	private String customerName;
	private String date;

	public Customer(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}

	public String toString() {
		String returnValue = customerName;
		StringTokenizer tokenizer = new StringTokenizer(date, "/");
		System.out.println("The Customer details are ");
		while (tokenizer.hasMoreTokens()) {
			returnValue = returnValue + "," + tokenizer.nextToken();
		}
		return returnValue;
	}
}
