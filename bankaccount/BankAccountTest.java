public class BankAccountTest{
    public static void main(String[] args){
        BankAccount a001 = new BankAccount();
        BankAccount a002 = new BankAccount();
        BankAccount a003 = new BankAccount();
        BankAccount a004 = new BankAccount();
        BankAccount a005 = new BankAccount();

        System.out.println("Number of bank accounts in system: " + BankAccount.getNumOfAccounts());

        System.out.println("Your checking account balance is: " + a001.getCheckingAccount());
        System.out.println("Your savings account balance is: " + a001.getSavingsAccount());

        System.out.println("Total bank assets: " + BankAccount.getTotalAssets());

        a001.depositCheckingAccount(150.00);
        a001.depositSavingsAccount(2000.50);

        System.out.println("Total bank assets: " + BankAccount.getTotalAssets());

        System.out.println("Your checking account balance is: " + a001.getCheckingAccount());
        System.out.println("Your savings account balance is: " + a001.getSavingsAccount());

        System.out.println("Your checking account balance is: " + a001.getCheckingAccount());

        System.out.println("Your total account balance is: " + a001.getTotalAccountValue());





    }


}