package com.stackroute.main;

import java.util.Scanner;

public class Problem6 {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int mul=1;
        for(int i=1;i<=n;i++){
            if((Math.log(mul)+Math.log(i))>(32*Math.log(2)))
            {
                return -1;
            }
            mul=mul*i;
        }

        return mul;
    }
    public static long longFactorial(int n){
        if(n==0){
            return 1;
        }
        long mul=1;
        for(int i=1;i<=n;i++){
            if((Math.log(mul)+Math.log(i))>(64*Math.log(2)))
            {
                return -1;
            }
            mul=mul*i;
        }

        return mul;
    }
    public static void main(String[] args){
        int i=1;
        while(true){
            int Ans=factorial(i);
            if(factorial(i)==-1){
                System.out.println("(int)The factorial of "+i+" is out of range");
                break;

            }
            System.out.println("(int)The factorial of "+i+" is "+Ans);
            i++;
        }
        i=1;
        while(true){
            long Ans= longFactorial(i);
            if(longFactorial(i)==-1){
                System.out.println("(long)The factorial of "+i+" is out of range");
                System.exit(0);

            }
            System.out.println("(long)The factorial of "+i+" is "+Ans);
            i++;
        }
    }
}
