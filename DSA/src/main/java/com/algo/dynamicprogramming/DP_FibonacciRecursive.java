package com.algo.dynamicprogramming;

import java.util.HashMap;

public class DP_FibonacciRecursive {
    static HashMap<Integer, Long> map = new HashMap<>();
    public static void main(String[] args) {

        int fact_number = 7;
        System.out.println(fibonacci(fact_number));
        System.out.println("The 0th fibonacci number is: " + fibonacci(0));
        System.out.println("The 7th fibonacci number is: " + fibonacci(7));
        System.out.println("The 12th fibonacci number is: " + fibonacci(12));
        System.out.println("The 12th fibonacci number is: " + fibonacci(50));

    }

    public static long fibonacci(int factNumber) {

        long temp;

        if(factNumber == 0 || factNumber == 1) return 1;
        if(map.containsKey(factNumber)) {
            //System.out.println("Inside");
            return map.get(factNumber);
        }

        temp =  fibonacci(factNumber - 1) + fibonacci(factNumber-2);
        // memoize
        map.put(factNumber, temp);
        return temp;
    }
}
