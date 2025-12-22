package org.example;

public class OneToNRecusrion {
            // Your code goes here
       public static void printOneToN(int n) {
           if (n <= 0) {
               return;
           } else {
               printOneToN(n - 1);
           }
           System.out.println(n);
       }

    public static void main(String[] args) {
        printOneToN(10);
    }
}
