package Lab5Account;

public class Account {
	private String accName;
	private String acid;
	private int balance;

	public Account(String accName, String acid, int balance) {
		super();
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}

	public Account(){

	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAcid() {
		return acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	public void deposit(int d){
		balance = balance + d;
		//return balance;
	}
	public void withdraw(int d){
		balance = balance - d;
		//return balance;
	}
}

	
	
	
