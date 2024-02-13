package com.interviewquestions;

import java.util.Scanner;

import static java.lang.System.in;

public class StringReverse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(in);  // Create a Scanner object
        System.out.println("Enter String to reverse : ");

        String inputStr = myObj.nextLine();  // Read user input
        //System.out.println("Username is: " + userName);  // Output user input
        String reverseStr = reverseString(inputStr);
        System.out.println("Reverse String : " + reverseStr);
    }

    private static String reverseString(String inputStr) {
        StringBuilder sb = new StringBuilder(inputStr);
        return sb.reverse().toString();
    }
}
