public class BankAccountDriver
{
    public static void main(String[] args)
    {
        BankAccount cash = new BankAccount(500.00);
        System.out.println(cash);
        cash.withdraw(50.00);
        cash.deposit(200.00);
        System.out.println(cash);

        System.out.println();

        CheckingAccount munnies = new CheckingAccount(3000.00);
           System.out.println(munnies);
           munnies.withdraw(50.00);
           munnies.deposit(200.00);
           munnies.withdraw(50.00);
           System.out.println(munnies);
           munnies.deposit(200.00);
           munnies.deposit(200.00);
           munnies.deductFees();
           System.out.println(munnies);

           System.out.println();

          SavingsAccount collegeFund = new SavingsAccount(5000.00, 0.02);
           System.out.println(collegeFund);
           collegeFund.deposit(200.00);
           collegeFund.withdraw(50.00);
           collegeFund.addInterest();
           System.out.println(collegeFund);
    }
}
