package javaproject;

public class split2 {

	public static void main(String[] args) {
		 String s = "He is a very very good boy,!! isn't he?";
		  String s1="";
	        for(int i=0;i<s.length();i++) {
	            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' ) {
	                s1= s1+ s.charAt(i);
	            } else {
	                s1=s1+"\n";
	            }
	        }
	        String s2[]=s1.split("\n");
	        int x=0;
	        String s3="";
//	       
	        for(int k=0;k<s2.length;k++)
	        {
	            if(s2[k].isEmpty()) {
	                continue;
	            }
	            x++;
	            s3= s3+ (s2[k]) + "\n";
	        }
	        System.out.println(x +"\n"+ s3);
		// TODO Auto-generated method stub

	}

}
	