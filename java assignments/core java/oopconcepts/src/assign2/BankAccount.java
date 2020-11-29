package assign2;

public class BankAccount {

	private int accno;
	private double balance;
	
	public BankAccount() {
		super();
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", balance=" + balance + "]";
	}

	public BankAccount(int accno, double balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	
	
	
}
