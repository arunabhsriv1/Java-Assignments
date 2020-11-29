package assignment1;

import java.time.LocalDate;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate initial = LocalDate.now();
		LocalDate start = initial.withDayOfMonth(1);
		LocalDate end = initial.withDayOfMonth(initial.lengthOfMonth());
		System.out.println(end);
	}
	
}
