package com.techelevator;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int newBalance = super.withdraw(amountToWithdraw);
        int serviceCharge = 10;
        if (newBalance < 0 && newBalance > -100) {
            super.withdraw(serviceCharge);
        }
        if (newBalance <= -100) {
            super.deposit(amountToWithdraw);
            return this.getBalance();
        }
        return newBalance;

    }


}
