package com.interviewquestions;

public class LargestNumber {
    public static void main(String[] args) {
        int[] num = { 10, 12, 34, 43, 23, 29 };
        int largestNum = findLargest(num);
        System.out.println("Largest Number is : " + largestNum);
    }

    private static int findLargest(int[] num) {
        int largest = 0;
        for(int i=0; i < num.length ;i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }
}
