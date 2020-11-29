package package2;

public class Account {

	private int accNum;
	private String type;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int accNum, String type, double balance) {
		super();
		this.accNum = accNum;
		this.type = type;
		this.balance = balance;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", type=" + type + ", balance=" + balance + "]";
	}
	
	
}
