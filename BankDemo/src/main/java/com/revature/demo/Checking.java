package com.revature.demo;

public class Checking extends Bank
{

    public Checking() {
    }

    public Checking(String id, String name, double balance) {
        super(id, name, balance);
    }

    public void deposit(double amount)
    {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount)
    {
//        double sur = (amount * 0.01)/100;
//        amount = amount + sur;
        super.setBalance(super.getBalance()-(amount + ((amount*0.01)/100)));
    }

    @Override
    public String toString()
    {
        return "Checking{}" + super.toString();
    }
}
