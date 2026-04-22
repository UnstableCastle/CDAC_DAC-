package campus.accounts;

import java.util.Date;

import campus.academics.Student;

public class Fees {
private Student s1;
private double amount;
private Date paymentDate;
public Fees(Student s1, double amount, Date paymentDate) {
	super();
	this.s1 = s1;
	this.amount = amount;
	this.paymentDate = paymentDate;
} 

public double getAmount() {
    return amount;
}

@Override
public String toString() {
    return "Student=" + s1 + ", Amount=" + amount + ", PaymentDate=" + paymentDate;
}
}