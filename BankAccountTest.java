package models;

public class BankAccountTest {

    public static void main(String[] args) {
        // 
        BankAccount account1 = new BankAccount(250.0, 500.0);
        BankAccount account2 = new BankAccount(200.0, 100.0);
        
        
        account1.moneyDeposit("checking", 20);
        account2.moneyDeposit("savings", 200);
        
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());
        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingsBalance());
        System.out.println("Num of Accounts " + BankAccount.getNumOfAccounts());
        System.out.println("Total Funds " + BankAccount.getTotalFunds());
        
        account1.moneyWithdrawal("checking", 50);
        account2.moneyWithdrawal("savings", 500);
        
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());
        System.out.println(account1.getTotalAccountBalance());
        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingsBalance());
        System.out.println(account2.getTotalAccountBalance());
        System.out.println(account2.getAccountNumber());
        System.out.println("Num of Accounts " + BankAccount.getNumOfAccounts());
        System.out.println("Total Funds " + BankAccount.getTotalFunds());
        
    }
}
