package org.example;

public class NSum {
    public static int NnumbersSum(int N) {
        //your code goes here
        if(N<=0){
            return 0;
        }else{
            return N + NnumbersSum(N-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(NnumbersSum(4));
    }

}
