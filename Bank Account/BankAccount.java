public class BankAccount // the superclass
{
    private double balance;

    public BankAccount(double bal)
    {
        this.balance = bal;
    }

    /**
     * returns the balance of the BankAccount (checking or savings)
     * @return a double value of the balance of BankAccount
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * adds to the value of the balance of the BankAccount
     * @param dep accepts a deposit value to be added to the balance
     */
    public void deposit(double dep)
    {
       balance += dep;
    }

    /**
     * subtracts from the balance of the BankAccount
     * @param wd accepts a withdrawal value to subtract from the balance
     */
    public void withdraw(double wd)
    {
        balance -= wd;
    }

    /**
     * a String representation that will print the balance
     * @return a String representation of balance
     */
    public String toString()
    {
        return "balance=" + balance;
    }
}
