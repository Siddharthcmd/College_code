package daalab;

import java.util.Scanner;

public class Division {
	public static void main(String args[]) {
		int a, b;
		int quotient;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first number (numerator) : ");
		a = in.nextInt();
		System.out.println("Please enter second number (denominator) : ");
		b = in.nextInt();
		try {
			quotient = a / b;
			System.out.println("Quotient = " + quotient);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
	}
}