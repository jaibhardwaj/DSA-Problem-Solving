package com.jai.recursion;

public class PrintDecreasing 
{
    public static void main(String[] args) 
    {
        int n = 5; // Example input
        printDecreasing(n);
    }

    public static void printDecreasing(int n) 
    {
        if (n == 0) 
        {
            return; // Base case: do nothing if n is 0
        }
        System.out.println(n); // Print the current value of n before the recursive call
        printDecreasing(n - 1); // Recursive call with n-1
    }

}
