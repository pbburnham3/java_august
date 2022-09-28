
public class BankAccount{

    private double checkingAccount;

    private double savingsAccount;

    private static int numOfAccounts;

    private static double totalAssets;


//method increment numOfAccounts by 1 for each account added through test file
    public BankAccount(){
        numOfAccounts++;
    }

//method to return total number of bank accounts in system
    public static int getNumOfAccounts(){
        return numOfAccounts;
    }

//method to return total bank assets
    public static double getTotalAssets(){
        return totalAssets;
    }

//balance check methods
    public double getCheckingAccount(){
        return this.checkingAccount;
    }

    public double getSavingsAccount(){
        return this.savingsAccount;
    }

    public double getTotalAccountValue(){
        return this.checkingAccount + this.savingsAccount;
    }

//account deposit + overall bank asset deposit methods
    public void depositCheckingAccount(double checkingDepositValue){
        this.checkingAccount += checkingDepositValue;
        totalAssets += checkingDepositValue;
    }
    public void depositSavingsAccount(double savingsDepositValue){
        this.savingsAccount += savingsDepositValue;
        totalAssets += savingsDepositValue;
    }

//account withdraw + overall bank asset withdraw methods
    public void withdrawCheckingAccount(double checkingWithdrawValue){
        if(this.checkingAccount < checkingWithdrawValue){
            System.out.println("Insufficient funds.");
        }
        else{
            this.checkingAccount -= checkingWithdrawValue;
            totalAssets -= checkingWithdrawValue;
        }
        
    }

    public void withdrawSavingsAccount(double savingsWithdrawValue){
        if(this.savingsAccount < savingsWithdrawValue){
            System.out.println("Insufficient funds.");
        }
        else{
            this.savingsAccount -= savingsWithdrawValue;
            totalAssets -= savingsWithdrawValue;
        }
        
    }



}