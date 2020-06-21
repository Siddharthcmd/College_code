package javaproject;

import java.util.Scanner;

public class substring {
	public static void main(String[] args) {
		String a1 = "dictionary";
		int length = a1.length();
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		int size = sc.nextInt();

		//		1
		
		for(int i = 0; i<size ; i++)
		{
			System.out.print(a1.charAt(i));
		}
		System.out.println();

		//		2
		
		for(int j= length-size; j<length; j++ )
		{
			System.out.print(a1.charAt(j));
		}
		System.out.println();

		//		3
		
		for(int k= size; k<length;k++)
		{
			System.out.print(a1.charAt(k));
		}

	}
}
