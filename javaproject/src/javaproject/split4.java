package javaproject;

public class split4 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 5, 5, 2, 2, 3, 4, 5, 5, 5, 5, 5, 46, 47, 48, 49, 49, 50, 6, 6, 6, 6, 6 };
		int temp = 0;
		int b[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int x = 0;
		for (int k = 0; k < arr.length - 1; k++) {
			if (arr[k] != arr[k + 1]) {
				b[x++] = arr[k];
			}
		}
		System.out.println(b[1]);
	}

}
