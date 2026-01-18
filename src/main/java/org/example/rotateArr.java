package org.example;

public class rotateArr {
    static void swapNos(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        // ✅ handle edge cases
        if (n <= 1) return;

        // ✅ handle d > n
        d = d % n;

        // if d becomes 0 after modulo
        if (d == 0) return;

        swapNos(arr, 0, d - 1);
        swapNos(arr, d, n - 1);
        swapNos(arr, 0, n - 1);
    }
}
