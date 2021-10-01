package models;
import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;

    private static int numOfAccounts;
    private static double totalFunds;

    public BankAccount() {
    }

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = accountGen();

        numOfAccounts++;
        totalFunds =+ (checkingBalance + savingsBalance);
    }


    public long accountGen() {
    	Random rand = new Random();
    	int num = rand.nextInt(1000000010 + 1000000000);
    	return num;
    }
    
    public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void moneyDeposit(String type, double deposit) {
    	if (type.equals("checking")) {
    		this.checkingBalance += deposit;
    	}
    	else {
    		this.savingsBalance += deposit;
    	}
		totalFunds += deposit;
    }
    
    public void moneyWithdrawal(String type, double withdraw) {
    	if (type.equals("checking")) {
    		if (this.checkingBalance < withdraw) {
    			System.out.println("Not enough funds");
    		}
    		else {
    			this.checkingBalance -= withdraw;
    			totalFunds -= withdraw;
    		}
    	}
    	else {
    		if (this.savingsBalance < withdraw) {
    			System.out.println("Not enough funds");
    		}
    		else {
    			this.savingsBalance -= withdraw;
    			totalFunds -= withdraw;
    		}
    	}
    }
    
    public double getTotalAccountBalance() {
    	return this.checkingBalance + this.savingsBalance;
    }
    
    
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	public static void setNumOfAccounts(int numOfAccounts) {
		BankAccount.numOfAccounts = numOfAccounts;
	}

	public static double getTotalFunds() {
		return totalFunds;
	}

	public static void setTotalFunds(double totalFunds) {
		BankAccount.totalFunds = totalFunds;
	}


}
