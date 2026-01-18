package org.example;

import java.util.ArrayList;

public class isSorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i) > arr.get(i+1) || arr.get(i) < arr.get(i-1)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
        return;
    }
}
