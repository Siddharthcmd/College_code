package customerdemo;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		String customerName;
		String date;
		Scanner in = new Scanner(System.in);
		System.out.println("Ënter customer name");
		customerName = in.next();
		System.out.println("Ënter Date (dd/mm/yyyy)");
		date = in.next();
		Customer customer = new Customer(customerName, date);
		System.out.println(customer.toString());
	}
}
