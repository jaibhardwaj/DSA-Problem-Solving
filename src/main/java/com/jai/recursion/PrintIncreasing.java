package com.jai.recursion;

public class PrintIncreasing 
{
    public static void main(String[] args) 
    {
        int n = 5; // Example input
        printIncreasing(n);
    }

    public static void printIncreasing(int n) 
    {
        if (n == 0) 
        {
            return; // Base case: do nothing if n is 0
        }
        printIncreasing(n - 1); // Recursive call with n-1
        System.out.println(n); // Print the current value of n after the recursive call
    }
}
