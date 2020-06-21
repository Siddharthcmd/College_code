package javaproject;

import java.util.HashMap;

public class string6 {
	public static String alpha(String arr1) {
		String arr[] = arr1.split("");
		String temp = "";
		String s2 = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[i]) < 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		int x = 1;
		for (int k = 0; k < arr.length; k++) {
			if (k+1 < arr.length && arr[k].compareTo(arr[k + 1]) == 0) {
				x++;
			} else {
				s2 = s2 + arr[k] + " : " +x +"\n";
				x = 1;
			}

		}
		
		return s2;
		
	}

	public static void main(String[] args) {
		String arr1 = "qwertyuiopasdfghjklzxcvbnmmnbvcxzlkjhgfdsapoiuytrewqqazwsxedcrfvtgbyhnujmikolp";
		String s3=alpha(arr1);
		System.out.println(s3);
	}

}
