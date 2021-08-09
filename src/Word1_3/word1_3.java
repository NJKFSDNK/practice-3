package Word1_3;

public class word1_3 {
	public static  int sumDay(int year, int mon, int day) {
		int allDay = 0;
		if(year % 4 == 0 && year % 100 != 0 || year % 400  == 0) {
			for(int i = 0; i < mon ; i++) {
				if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					allDay = allDay + 31;
				}else if(i==2) {
					allDay = allDay + 29;
				}else {
					allDay = allDay + 30;
				}
			}
			
		}else{
			for(int i = 1; i < mon ; i++) {
				if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					allDay = allDay + 31;
				}else if(i==2) {
					allDay = allDay + 28;
				}else {
					allDay = allDay + 30;
				}
			}
			
		}
		
		return allDay;
	}
	public static void main(String[] args) {
		System.out.println(sumDay(2021, 7, 29)+29);
	}

}
