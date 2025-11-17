package com.revature.demo;

public class BankManager
{
    static void main(String[] args)
    {
        Checking c1 = new Checking("C001","Steph",20000);
        System.out.println(c1);
        c1.withdraw(5000);
        System.out.println(c1);

    }
}
