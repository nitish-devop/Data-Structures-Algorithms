package ArrayProblems;

import java.util.Arrays;

public class LeftRotation {
    // Left Rotate By One 
    public static void leftRotateByOne(int arr[]) {
        int temp = arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
       
    } 
    // Left rotate by k times : O(k*N)
    public static void leftRotateByK(int arr[], int N,int k) {
        k = k % N ;
        for(int i=1;i<=k;i++) {
            leftRotateByOne(arr);
        }
    }


    // reverse
    public static void reverse(int[] arr,int start,int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
    }
    // Optimized approach : Using reversal
    public static void leftRotateByK_OP(int arr[], int k) {
        k = k % arr.length;
        // Reverse from 0 to k-1
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        leftRotateByK_OP(arr, 3);
        System.out.println(Arrays.toString(arr));
        
    }
}
