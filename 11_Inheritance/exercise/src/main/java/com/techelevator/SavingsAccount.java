package com.techelevator;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int newBalance = super.withdraw(amountToWithdraw);
        int serviceCharge = 2;
        if (newBalance < 150) {
            newBalance = super.withdraw(serviceCharge);
            if(newBalance < 0 ) {
                super.deposit(amountToWithdraw + serviceCharge);
            }
        }
        return this.getBalance();

        }

}
