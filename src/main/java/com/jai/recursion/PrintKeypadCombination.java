package com.jai.recursion;

/**
 * The PrintKeypadCombination class provides a method to print all possible letter combinations
 * for a given digit string, based on a typical mobile keypad mapping.
 */
public class PrintKeypadCombination
{
    /**
     * The keypad mapping for digits 0-9, where each index corresponds to a digit
     * and the string at that index contains the possible characters for that digit.
     */
    public static String[] keypad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args)
    {
        String que = "23";
        printKeypadCombination(que, "");
    }

    /**
     * Recursively prints all possible combinations of characters that can be formed
     * from a given string of digits based on a typical mobile keypad layout.
     *
     * @param que The input string containing digits (0-9).
     * @param ans The current combination being built.
     * <p>
     * Example recursion tree for input "23":
     * <p>
     * printKeypadCombination("23", "")
     *   - '2' -> "abc"
     *     a) printKeypadCombination("3", "a")
     *         - '3' -> "def"
     *             i) printKeypadCombination("", "ad") => prints "ad"
     *            ii) printKeypadCombination("", "ae") => prints "ae"
     *           iii) printKeypadCombination("", "af") => prints "af"
     *     b) printKeypadCombination("3", "b")
     *         - '3' -> "def"
     *             i) printKeypadCombination("", "bd") => prints "bd"
     *            ii) printKeypadCombination("", "be") => prints "be"
     *           iii) printKeypadCombination("", "bf") => prints "bf"
     *     c) printKeypadCombination("3", "c")
     *         - '3' -> "def"
     *             i) printKeypadCombination("", "cd") => prints "cd"
     *            ii) printKeypadCombination("", "ce") => prints "ce"
     *           iii) printKeypadCombination("", "cf") => prints "cf"
     *
     * This tree shows how the function explores all possible combinations.
     */
    public static void printKeypadCombination(String que, String ans)
    {
        if (que.isEmpty())
        {
            System.out.println(ans);
            return;
        }

        char ch = que.charAt(0);
        String ros = que.substring(1);


        String letters = keypad[ch - '0'];

        for (int i = 0; i < letters.length(); i++)
        {
            printKeypadCombination(ros, ans + letters.charAt(i));
        }
    }
}
