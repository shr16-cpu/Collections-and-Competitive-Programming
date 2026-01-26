package org.example;

public class PascalTriangle {
    public static void pascalTriangle(int r,int c){
        int[][] arr = new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pascalTriangle(4,2);
    }
}
