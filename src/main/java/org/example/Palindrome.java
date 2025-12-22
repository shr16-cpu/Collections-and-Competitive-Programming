package org.example;

public class Palindrome {
    public boolean isPalindrome(int n) {
        int sum = 0;
        int m = n;
        while(m!=0){
            int r = m%10;
            sum = sum * 10 + r;
            m = m/10;
        }

        return sum == n ? true : false;
    }
}
