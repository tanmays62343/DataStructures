package com.TrX;

import java.util.Arrays;

public class recursion2 {

    public static void main(String[] args) {

        var result = powerOfNum(2,3);
        System.out.println(result);
    }
    public static int powerOfNum(int B , int P){
        if(P==0){
            return 1;
        }
        return B *powerOfNum(B ,P-1);
    }
}
