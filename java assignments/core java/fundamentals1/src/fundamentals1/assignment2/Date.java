package fundamentals1.assignment2;

import java.time.LocalDate;

public class Date {
	
	private LocalDate date;
	
	public Date() {
		 super();
	}

	public Date(LocalDate date) {
		super();
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
