package A5;
public class CurrentAccount extends Account {
    static final double MIN_BALANCE = 1000;

    public CurrentAccount(int accNumber, String name, double balance, String branch) {
        super(accNumber, name, balance, branch);
    }

    @Override
    double getMinBalance() { 
        return MIN_BALANCE; 
    }

    @Override
    String getAccountType() { 
        return "Current"; 
    }
}