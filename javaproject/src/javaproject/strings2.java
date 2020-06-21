package javaproject;

public class strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1 = "Puneet Mishra 9980989200 9456212865 Siddharth Mishra 9988776655";
		int length = v1.length();
		int asc, next=0;
		int prev=0; 
		String ans_str = "";
		for(int i=0;i<length;i++)
		{
			asc = v1.charAt(i);
			
			if (i+1<length && i-1>=0) {
				next = v1.charAt(i+1);
				prev = v1.charAt(i-1);
			}
			if((asc == 32 && (next>=48 && next <=57) && prev >57) || 
			(asc == 32 && (prev>=48 && prev <=57) && next >57)){
				ans_str = ans_str + "\n";
			}
			ans_str = ans_str + v1.charAt(i);
			
		}
		System.out.println(ans_str);
	}

}

