public class SavingsAccount extends Account {
    static final double MIN_BALANCE = 5000;

    public SavingsAccount(int accNo, String name, double balance, String branch) {
        super(accNo, name, balance, branch);
    }

    @Override
	public String toString() {
		return "SavingsAccount []";
	}

	@Override
    double getMinBalance() { 
        return MIN_BALANCE; 
    }

    @Override
    String getAccountType() { 
        return "Savings"; 
    }
}





