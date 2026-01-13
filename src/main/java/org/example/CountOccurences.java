package org.example;

import java.io.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountOccurences {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of elements");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter" + n + "elements");
        String[] parts = br.readLine().trim().split("\\s+");
        int[] arr = new int[n];
        int[] hash = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(parts[i]);
            hash[arr[i]]++;
        }
        System.out.println("Enter no of elements to count");
        int m = Integer.parseInt(br.readLine());
        while(m>0){
            System.out.println("Enter the element");
            int no = Integer.parseInt(br.readLine());
            System.out.println(hash[no]);
            m--;

        }





    }
}
