package javaproject;

public class string3 {

	public static void main(String[] args) {
		String v1 = "This is a demo string. My name IS pUNEET mishra";
		String v2[]=v1.split(" ");
		for(int i = 0; i<v2.length; i++) {
			v2[i]=v2[i].substring(0,1).toUpperCase()+v2[i].substring(1,v2[i].length()).toLowerCase();	
		}
		System.out.println(String.join(" ", v2));
		
		

	}

}
