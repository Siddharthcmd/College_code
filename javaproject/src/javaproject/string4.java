package javaproject;

public class string4 {
	public static String Rp(String v1) {
String v2[]=v1.split(" ");
		
	    
		for(int i = 0; i<v2.length; i++) 
		{String rev="";
			for( int j=v2[i].length()-1;j>=0;j--)
			{
				rev = rev + v2[i].charAt(j);	
			}
			v2[i]=rev.substring(0,1).toUpperCase()+rev.substring(1,rev.length()).toLowerCase();
		}
		//System.out.println(String.join(" ", v2));
		return (String.join(" ", v2));
	}
	public static String Rp1(String v1)
	{
		String v2[]=v1.split(" ");
		for(int i = 0; i<v2.length; i++) {
			v2[i]=v2[i].substring(0,1).toUpperCase()+v2[i].substring(1,v2[i].length()).toLowerCase();	
		}
		return (String.join(" ", v2));
	}
	

	public static void main(String[] args) {
		String v1 = "This is a demo string My name IS pUNEET mishra";
		System.out.println(Rp1(v1));
		System.out.println(Rp(v1));
		
		
	}

}
