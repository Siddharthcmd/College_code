package javaproject;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1 = "This is a demo string. My name IS pUNEET mishra";
		String v2="";
		int length = v1.length();
		int asc,next=0;
		//This Is A Demo String. My Name Is Puneet Mishra
		//Siht Si A Oemd Gnirts. Ym Eman Si Teenup Arhsim
		//System.out.println(v1.toUpperCase());
		
		for(int i = 0;i<length;i++)
		{
			asc=v1.charAt(i);
			v2=v2+v1.charAt(i);
			if(asc==32)
			{
				if(i+1<length)
				{
					v2= v2+  (v1.charAt(i+1)+"").toUpperCase();
					//v2=v2+v1.charAt(i);
					i++;
					continue;
				}
			}
			//System.out.println(v2);
			
		}
		
System.out.println(v2);
	}

}
