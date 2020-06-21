package javaproject;

import java.util.Scanner;

public class str_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String s1="anagram";
	        String ss1=s1.toLowerCase();
	        String s12[]=ss1.split("");
	        String s13="";
	        String s2="margana";
	        String ss2=s2.toLowerCase();
	        String s22[]=ss2.split("");
	        String s23="";
	        String temp;
	        System.out.println(s1.compareTo(s2));
	       for(int i = 0;i<s12.length;i++) {
	    	   for(int j = 0; j<s12.length-i-1; j++) {
	    			   if (s12[j].compareTo(s12[j+1]) > 0) { 
	                       temp = s12[j]; 
	                       s12[j] = s12[j+1]; 
	                       s12[j+1] = temp; 
	                   } 
	    		   }
	    	   }
	       for(int k=0;k<s12.length;k++) {
	    	   s13=s13+s12[k];
	       }
	       for(int l = 0;l<s22.length;l++) {
	    	   for(int m = 0; m<s22.length-l-1; m++) {
	    			   if (s22[m].compareTo(s22[m+1]) > 0) { 
	                       temp = s22[m]; 
	                       s22[m] = s22[m+1]; 
	                       s22[m+1] = temp; 
	                   } 
	    		   }
	    	   }
	       for(int n=0;n<s22.length;n++) {
	    	   s23=s23+s22[n];
	       }
	       System.out.println(s13);
	       System.out.println(s23);
	       System.out.println(s13.compareTo(s23));
	       if(s13.compareTo(s23)==0) {
	    	   System.out.println("armg");
	       }else {
	    	   System.out.println("not armg");
	       }
	       

	       
		       
	       
	}     

}
