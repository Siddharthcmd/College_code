package javaproject;

import java.util.Scanner;

public class invert {

	public static void main(String[] args) {
		int r=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value"+sc);
		int n=sc.nextInt();
		while(n!=0) {
			r=r*10;
			r=r+(n%10);
			n=n/10;
		}
		System.out.println(r);

	}

}
