package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = { 8,8,7,6,5};
        int first = arr[0];
        int second = -1;
        for(int i=0;i<arr.length;i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }else if( first > arr[i] && second < arr[i]){
                second = arr[i];
            }
        }
        System.out.println(second);

    }
}
