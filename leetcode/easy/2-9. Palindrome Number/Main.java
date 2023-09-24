


/*
Given an integer x, return true if x is a
        palindrome
        , and false otherwise.



        Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

*/

import javax.management.StringValueExp;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int x=12131;
        Solution solve= new Solution();
        Boolean answer=solve.isPalindrome(x);
        System.out.println(answer);


    }
}

class Solution {
    public boolean isPalindrome(int x) {
//        String xStr= String.valueOf(x);
//        String reversed = new StringBuilder(xStr).reverse().toString();
//        return xStr.equals(reversed);


        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        Deque<Integer> digits = new LinkedList<>();

        int num = x;
        while (num > 0) {
            digits.addLast(num % 10);
            num /= 10;
        }
//size
        while (digits.size() > 1) {
            if (digits.pollFirst() != digits.pollLast()) {
                return false;
            }
        }

        return true;
    }
}