package assign2;

public class Saving extends BankAccount {

	private int roi;
	
	public Saving() {
		super();
	}

	public Saving(int accno, double balance,int roi) {
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
		return "Saving [roi=" + roi + ", getAccno()=" + getAccno() + ", getBalance()=" + getBalance() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
