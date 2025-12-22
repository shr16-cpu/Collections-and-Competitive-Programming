package org.example;

public class ReverseNumber {
        public int reverseNumber(int n) {
            int sum=0;
            while(n!=0){

                int r=n%10;
                sum = sum * 10 + r;
                n=n/10;


            }
            return sum;
        }
}
