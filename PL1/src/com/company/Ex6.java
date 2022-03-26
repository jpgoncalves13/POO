package com.company;

public class Ex6 {
    public static long factorial(int num){
        long fact = num;
        if (num == 0) return 1;
        else{
            while(num > 1) {
                fact = fact * (num-1);
                num--;
            }
        }
        return fact;
    }
}
