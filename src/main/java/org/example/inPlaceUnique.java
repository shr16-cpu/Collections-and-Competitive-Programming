package org.example;

public class inPlaceUnique {
    public static int sortInplace(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j] = arr[i];
            }
        }
        j=j+1;
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println(sortInplace(arr));

    }
}
