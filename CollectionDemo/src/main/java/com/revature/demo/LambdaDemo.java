package com.revature.demo;

import java.net.CacheRequest;

public class LambdaDemo
{
    static void main(String[] args) {
        //Calculator calc = (n1,n2)-> (n1+n2);

        //System.out.println(calc.operation(3,6));
        printResult(2,3,(x,y)->x+y);
        printResult(3,5,(a,b)->a*b);

    }

    public static void printResult(int a, int b, Calculator calc)
    {
        int result = calc.operation(a,b);
        System.out.println(result);
    }
}
