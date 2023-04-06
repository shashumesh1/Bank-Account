public class SavingsAccount extends BankAccount // child class of BankAccount
{
    private double interestRate;

    public SavingsAccount(double bal, double interestRate)
    {
        super(bal); // Overloaded Constructor accepts a balance which is set to the initial balance of the parent class
        this.interestRate = interestRate; // interestRate is set to the Constructor in the SavingsAccount class
    }

    /**
     * multiplies the balance value with the interestRate value
     * adds the product into the SavingsAccount (BankAccount) by calling the deposit method of the superclass
     */
    public void addInterest()
    {
        deposit(getBalance() * interestRate);
    }

    /**
     * prints a String representation of balance and interestRate
     * @return a String consisting of the balance and the interestRate
     */
    public String toString()
    {
        return super.toString() + ", interestRate=" + interestRate;
    }
}
