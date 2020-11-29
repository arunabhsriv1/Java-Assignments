package fundamentals1.assignment2;

import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
	
		Date date1=new Date();
		date1.setDate(LocalDate.now());
		System.out.println(date1.getDate().getDayOfMonth());
		System.out.println(date1.getDate().getMonthValue());
		System.out.println(date1.getDate().getYear());
		
		Date date2=new Date(LocalDate.of(2020, 9, 23));
		System.out.println(date2.getDate().getDayOfMonth());
		System.out.println(date2.getDate().getMonthValue());
		System.out.println(date2.getDate().getYear());
	}
}