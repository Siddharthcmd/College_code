package javaproject;

public class lapin {

	public static void main(String[] args) {
		String s = "cccddccc";
		// Student s= new Student();

		String s1 = s.substring(0, s.length() / 2);
		String s2 = "";
		String temp = "";
		String temp1 = "";
		if (s.length() % 2 == 0) {
			s2 = s.substring(s.length() / 2, s.length());
		} else {
			s2 = s.substring((s.length() / 2) + 1, s.length());
		}
		String s11[] = s1.split("");
		String s22[] = s2.split("");

		for (int i = 0; i < s11.length; i++) {
			for (int j = i + 1; j < s11.length; j++) {
				if (s11[j].compareTo(s11[i]) < 0) {
					temp = s11[j];
					s11[j] = s11[i];
					s11[i] = temp;
				}
			}
		}
		for (int i = 0; i < s22.length; i++) {
			for (int j = i + 1; j < s22.length; j++) {
				if (s22[j].compareTo(s22[i]) < 0) {
					temp1 = s22[j];
					s22[j] = s22[i];
					s22[i] = temp1;
				}
			}
		}
		if (String.join("", s11).compareTo(String.join("", s22)) == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
