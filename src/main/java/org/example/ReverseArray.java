package org.example;

class ReverseArray {
    public void reverseArray1(int[] arr, int n, int start,int end){
        if(start>end){
            return;
        }else{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray1(arr,n,start+1,end-1);

        }
    }
    public void reverse(int[] arr, int n) {
        int start = 0;
        int end = n-1;
        reverseArray1(arr,n,start,end);
    }
}


