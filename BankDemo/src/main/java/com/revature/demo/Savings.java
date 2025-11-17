package com.revature.demo;

public class Savings extends Bank implements SimpleInterest
{
    public Savings() {
    }

    public Savings(String id, String name, double balance) {
        super(id, name, balance);
    }

    public void deposit(double amount)
    {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount)
    {
        super.setBalance(super.getBalance()-amount);
    }


    @Override
    public String toString()
    {
        return "Checking{}" + super.toString();
    }

    @Override
    public double calcInterest(double percentage)
    {
        return super.getBalance() * percentage;
    }
}
