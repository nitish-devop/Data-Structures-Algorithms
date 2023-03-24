package ArrayProblems;

import java.util.Arrays;

public class RightRotation {
    // right Rotate By One 
    public static void rightRotateByOne(int arr[],int N) {
        int temp = arr[N-1];

        for(int i=N-1;i>0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    } 
    // right rotate by k times : O(k*N)
    public static void rightRotateByK(int arr[], int N,int k) {
        k = k % N ;
        for(int i=1;i<=k;i++) {
            rightRotateByOne(arr,N);
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
    public static void rightRotateByK_OP(int arr[], int k) {
        k = k % arr.length;

        // Reverse from 0 to N-1
        reverse(arr,0,arr.length-1);
        // Reverse from 0 to k-1
        reverse(arr,0,k-1);
        // Reverse from k to N-1
        reverse(arr,k,arr.length-1);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        // rightRotateByK(arr,arr.length,3);
        // System.out.println(Arrays.toString(arr));

        rightRotateByK_OP(arr,3);
        System.out.println(Arrays.toString(arr));
        
    }
}
