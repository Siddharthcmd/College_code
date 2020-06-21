package javaproject;

public class str_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ff = "pUNEeT.";
		String rev = "";
		for(int i=ff.length()-1; i>=0; i--) {
			rev = rev + ff.charAt(i);
		}
		System.out.println(rev.substring(0,1).toUpperCase() + rev.substring(1,rev.length()).toLowerCase());
	}

}
