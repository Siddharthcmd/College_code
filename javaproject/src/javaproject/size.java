package javaproject;

import java.util.Calendar;

public class size {
	public static void main(String[] arg) {
		String s="😀😍😇🔥😎😍🤠🤑😉🙏👍🏼💪🏻👌🏻😂🤣😆🙂⭐️🤓😶😡😈💩😫🙄🤢";
		String t="वैदिक काल की नारियों";
		String u="my name is siddharth";
		int x,y,z;
		x=s.length();
		y=t.length();
		z=u.length();
		if(x>=100) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
		Calendar rightNow = Calendar.getInstance();
		
		
		System.out.println(z);
	}

}
