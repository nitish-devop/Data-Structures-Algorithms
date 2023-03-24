package ArrayProblems;

import java.util.ArrayList;

public class ArrayIntersection {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j])
                    ans.add(arr1[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr =  {2, 3, 5, 6}; 

        ArrayList<Integer> ans = intersection(arr1, arr);
        for(Integer item : ans) {
            System.out.print(item+" ");
        }


    }
}
