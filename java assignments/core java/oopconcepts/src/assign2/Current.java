package assign2;

public class Current extends BankAccount {

	private int roi;
	
	public Current() {
		super();
	}

	public Current(int accno, double balance,int roi) {
		super(accno, balance);
		this.roi=roi;
	}

	public int getRoi() {
		return roi;
	}

	public void setRoi(int roi) {
		this.roi = roi;
	}

	@Override
	public String toString() {
		return "Current [roi=" + roi + ", getAccno()=" + getAccno() + ", getBalance()=" + getBalance() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	
	
}
