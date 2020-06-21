package javaproject;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
	    int num1[]= {1,0,0,0,0,1,1,1,1};
	    String n1="", n2="";
	    for(int i=0; i<num1.length;i++) {
	    	if(num1[i]==0) {
	    		n2 += num1[i];
	    	} else {
	    		n1 += num1[i];
	    	}
	    }
	    if(n2.length()==n1.length())
	    {
	    	System.out.println(n1.substring(0,n1.length()) + n2.substring(0,n2.length()));
	    }
	    else if(n2.length()>n1.length())
	    {
	    	System.out.println(n1.substring(0,n1.length()) + n2.substring(0,n1.length()));
	    }
	    else
	    {
	    	System.out.println(n1.substring(0,n2.length()) + n2.substring(0,n2.length()));
	    }
	    
	   // System.out.println(n1 + n2);

	}

}
