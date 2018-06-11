package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeStamp {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date");
		String date = sc.nextLine();
		Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(date);
		Date date2 = new Date();
		long day= (date2.getTime()-date1.getTime())/(24*60*60*1000);
		System.out.println(day+" days ago.");
		long sec= (date2.getTime()-date1.getTime())/(1000);
		System.out.println(sec+" seconds ago.");
		sc.close();
	}

}
