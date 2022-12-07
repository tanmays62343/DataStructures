package com.TrX;

//sum of digits in a given number
//f(n) = (n%10) + (n/10)

public class recursion1 {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(3433));
    }

    public static int sumOfDigits(int n){
       if( n==0 || n<0 ){
           return 0;
       }
        return n%10 +sumOfDigits(n/10);
    }
}
