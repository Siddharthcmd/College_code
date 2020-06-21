//import java.util.Calender;
package javaproject;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.LocalDate;

public class hr1 {

	public static void main(String[] args) {
//		Calendar rightNow = Calendar.getInstance();
//		rightNow.set(year, month, date);
//		rightNow.set(2015, 7, 5);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
//		DateFormatSymbols dfs = new DateFormatSymbols();
//		String dateInString = "31-08-1982 10:20:56";
//		int day_of_week = rightNow.get(Calendar.DAY_OF_WEEK);
//		System.out.println(rightNow.getTime());
//		System.out.println(dfs.getWeekdays()[day_of_week].toUpperCase());
		// TODO Auto-generated method stub
		double number  = 12345.34;
//		DecimalFormat df = new DecimalFormat("## ##,###.00");
		NumberFormat nf =NumberFormat.getCurrencyInstance();
        String currency = nf.format(number);
System.out.println(number);
System.out.println(currency);
	}

	
	 
}
