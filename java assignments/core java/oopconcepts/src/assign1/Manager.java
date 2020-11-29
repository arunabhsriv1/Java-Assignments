package assign1;

import static assign1.Employee.basesal;

public class Manager extends Employee {

	private int allowance;
	
	@Override
	public double calculateSalary() {
		basesal=1000;
		return basesal+allowance;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
}
