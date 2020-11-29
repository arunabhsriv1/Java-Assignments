package assign1;

import static assign1.Employee.basesal;

public class SalesManager extends Employee{

private int commission;
	
	@Override
	public double calculateSalary() {
		basesal=1000;
		return basesal+commission;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	
	
}
