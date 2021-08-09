package Calendar;

import java.util.Date;

import Word1_3.word1_3;

public class calendar {
	public static void main(String[] args) {
	Date now = new Date();
//	计算第几天
	int days = 0;
	int year = now.getYear()+1900;
	int mon = now.getMonth()+1;
	int day = now.getDate();
	for(int i=1990; i<year; i++) {
		if(i % 4 == 0 && i % 100 != 0 || i % 400  == 0) {
			days = days + 366;
		}else {
			days = days + 365;
		}
	}
	word1_3 a = new word1_3();
	int monDays = a.sumDay(year, mon, day);
	days = days + monDays;
//	1号是第几天
	System.out.println(now.toLocaleString());
	int week=days%7+1;
	System.out.println("一\t二\t三 \t四 \t五 \t六 \t日");
	int c = 0;
	if(day == 1 || day == 3 || day == 5 || day == 7 || day == 8 || day == 10 || day == 12) {
		c = 31;
	}else if(day==2) {
		c = 28;
	}else {
		c = 30;
	}
	System.out.print("\t\t\t1\t");
	for(int i = 2; i < c; i++) {
		System.out.print(i+"\t");
		if((i+3)%7 == 0) {
			System.out.print("\n");
		}
		
	}
	
	
//	System.out.println(now.getYear()+1900);
//	System.out.println(now.getMonth()+1);
//	System.out.println(now.getDate());
	
	
		
		
	}
	

}
