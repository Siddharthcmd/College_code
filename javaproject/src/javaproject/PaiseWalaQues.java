package javaproject;

import java.util.HashMap;
import java.util.Map;

public class PaiseWalaQues {
	public static void main(String[] args) {
		String arr1 = "1822345657853";
		HashMap<String, Integer> myMap = new HashMap<>();
		String letterKey = "";
		for (int i = 0; i < arr1.length(); i++) {
			letterKey = arr1.charAt(i) + "";
			if (myMap.containsKey(letterKey)) {
				myMap.put(letterKey, myMap.get(letterKey) + 1);
			} else {
				myMap.put(letterKey, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		oo: for (int i = 0; i < arr1.length(); i++) {
			letterKey = arr1.charAt(i) + "";
			if (myMap.get(letterKey) > 1) {
				System.out.println("First repeating : " + letterKey);
				break oo;
			}
		}
		oo: for (int i = 0; i < arr1.length(); i++) {
			letterKey = arr1.charAt(i) + "";
			if (myMap.get(letterKey) == 1) {
				System.out.println("First non repeating : " + letterKey);
				break oo;
			}
		}
		
		
		

		
		
		
//		String arr[] = arr1.split("");
//		String temp = "";
//		String s2 = "";
//		int x = 0;
//		int x1 = 0;
//		outerloop: for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length - 1; j++) {
//				if (arr[i].compareTo(arr[j]) == 0) {
//					x = i;
//					break outerloop;
//				}
//			}
//		}
//		outerloop: for (int l = 0; l < arr.length; l++) {
//			innerloop: for (int j = l + 1; j < arr.length; j++) {
//				if (arr[l].compareTo(arr[j]) != 0) {
//					x1 = l;
//					System.out.println("1--->"+arr[x1]+"\t"+x1);
//				} else {
//					//System.out.println("-----------------------------");
//					x1 = 0;
//					System.out.println("2--->"+arr[x1]+"\t"+x1);
//					break innerloop;
//
//				}
//			}
//		}
//		System.out.println(arr[x]);
//		System.out.println(arr[x1]);

	}
}
