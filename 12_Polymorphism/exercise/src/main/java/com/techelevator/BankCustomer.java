package com.techelevator;
import java.util.ArrayList;
import java.util.List;


public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    public Accountable[] getAccounts() {
        Accountable[] accountsArray = new Accountable[accounts.size()];
        accountsArray = accounts.toArray(accountsArray);

        return accountsArray;
    }


    public boolean isVip() {
        Accountable[] accounts = getAccounts();
        int combinedBalance = 0;
        for(Accountable account:accounts) {
            combinedBalance += account.getBalance();
        }
        if(combinedBalance >= 25000) {
            return true;
        } else {
            return false;
        }
    }
}
