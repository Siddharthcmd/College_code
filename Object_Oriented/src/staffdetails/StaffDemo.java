package staffdetails;

import java.util.Scanner;

public class StaffDemo {

	public static void main(String[] args) {
		int i;
		String staffId, name;
		float salary;
		String phoneNumber, domain, publication, skills, period;
		System.out.println("\033[31mEnter no. of staff to be created for each category(n>=3)\033[31m");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Teaching[] teachingStaff = new Teaching[n];
		Technical[] technicalStaff = new Technical[n];
		Contract[] contractStaff = new Contract[n];
		System.out.println("Enter Teaching staff details");
		for (i = 0; i < n; i++) {
			System.out.println("Enter Teaching staff" + (i + 1) + "Details");
			System.out.println("Enter Teaching Details(StaffId,Name,Salary,PhoneNumber,Domain,Publication)");
			staffId = in.next();
			name = in.next();
			salary = in.nextFloat();
			phoneNumber = in.next();
			domain = in.next();
			publication = in.next();
			teachingStaff[i] = new Teaching(staffId, name, salary, phoneNumber, domain, publication);
		}
		System.out.println("Enter Technical staff details");
		for (i = 0; i < n; i++) {
			System.out.println("Enter Technical staff" + (i + 1) + "Details");
			System.out.println("Enter Technical staffDetails(StaffId,Name,Salary,PhoneNumber,Skills)");
			staffId = in.next();
			name = in.next();
			salary = in.nextFloat();
			phoneNumber = in.next();
			skills = in.next();
			technicalStaff[i] = new Technical(staffId, name, salary, phoneNumber, skills);
		}
		System.out.println("Enter Contract staff details");
		for (i = 0; i < n; i++) {
			System.out.println("Enter Contract staff" + (i + 1) + "Details");
			System.out.println("Enter Contract staff details StaffId,Name,Salary,PhoneNumber,Period");
			staffId = in.next();
			name = in.next();
			salary = in.nextFloat();
			phoneNumber = in.next();
			period = in.next();
			contractStaff[i] = new Contract(staffId, name, salary, phoneNumber, period);
		}
		System.out.println();
		System.out.println("Teaching Staff Details are as follows");
		for (i = 0; i < n; i++) {
			System.out.println(teachingStaff[i]);
		}
		System.out.println();
		System.out.println("\u001B31;Technical Staff Details are as follows");
		for (i = 0; i < n; i++) {
			System.out.println(technicalStaff[i]);
		}
		System.out.println();
		System.out.println("\u001B31;Contract Staff Details are as follows");
		for (i = 0; i < n; i++) {
			System.out.println(contractStaff[i]);
		}
	}

}
