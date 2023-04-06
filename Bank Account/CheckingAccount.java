public class CheckingAccount extends BankAccount // child class of BankAccount
{
    private int transactions;
    private final int FREE_TRANSACTIONS = 3;
    private final double TRANSACTION_FEE = 2.0;

    public CheckingAccount(double bala)
    {
        super(bala); // Overloaded Contructor accepts a balance which is set to the initial balance of the parent class
    }

    /**
     * takes the deposit and adds to the balance of CheckingAccount (BankAccount)
     * increments the number of transactions
     * @param dep accepts a double deposit value to be added to the balance
     */
    public void deposit(double dep)
    {
        super.deposit(dep);
        transactions++;
    }

    /**
     * subtracts the withdrawal value from the balance of CheckingAccount (BankAccount)
     * @param wd accepts a double withdrawal value to subtract from the balance
     */
    public void withdraw(double wd)
    {
        super.withdraw(wd);
        transactions++;
    }
    /**
     * checks if the number of transactions is greater than the FREE_TRANSACTIONS (3)
     * for each transaction that is greater than the FREE_TRANSACTIONS,
     * the TRANSACTION_FEE of 2.0 is withdrawn from the balance
     */
    public void deductFees()
    {
        if(transactions > FREE_TRANSACTIONS)
        {
            for (int i = FREE_TRANSACTIONS; i < transactions; i++)
            {
                super.withdraw(TRANSACTION_FEE);
            }
            transactions = 0;
        }
    }

    /**
     * prints the balance and the transactions
     * @return a String representation of balance and transactions
     */
    public String toString()
    {
        return super.toString() + ", transactions=" + transactions;
    }

}
