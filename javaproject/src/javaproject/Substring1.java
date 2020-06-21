package javaproject;

import java.util.Scanner;

public class Substring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "dictionary";
		int length = a1.length();
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		int size = sc.nextInt();
		System.out.println(a1.substring(0, size));
		System.out.println(a1.substring(length-size, length));
		System.out.println(a1.substring(size, length));
	}

}
