package com.revature.demo;
public class Main
{
    static void main(String[] args)
    {
        Person p1 = new Person("Steph", 21);
        Person p2 = new Person();

        p2.setName("Steph");
        p2.setAge(21);

        System.out.println(p1);
        System.out.println(p2.getName() + " is " + p2.getAge());

        if(p1.equals(p2))
            System.out.println("Person 1 is the same as person 2");
        else
            System.out.println("Person 1 and 2 are not the same");

    }
}
