package ArrayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class TwoSum {
    public static int[] twoSumBrute(int[] arr,int target) {
        int[] ans = {-1,-1};

        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target) 
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    // Using two pointer : Usable if we dont have to keep index record
    public static boolean twoSum_2Pointer(int[] arr,int target) {
        
        // Sort array
        Arrays.sort(arr);

        int[] ans = {-1,-1};
        int start = 0;
        int end = arr.length-1;
       
        while(start < end) {
            // target is equal to arr[start] + arr[end]
            if(arr[start] + arr[end] < target )
                start++;
            else if(arr[start] + arr[end] > target) {
                end--;
            }else {
                
                return true;
            }
        }
        return false;
    }


    // Using Hashmap
    public static int[] twoPointer_map(int arr[],int target) {
        int ans[] = {-1,-1};

        // Initalize hashmap for stroring arr[i]--target
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int remain = target-arr[i];
            if(map.containsKey(remain))
            {
                ans[0] = map.get(remain);
                ans[1] = i;
                return ans;
            }else{
                map.put(arr[i], i);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {-1,4,2,3,6}; 
        int target = 9;
        int[] ans = twoPointer_map(arr, target);
        System.out.println(Arrays.toString(ans));

    }
}
