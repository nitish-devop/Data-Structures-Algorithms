package ArrayProblems;

public class RemoveDuplicates {
   
    // removeDuplicates using two pointer
    public static int removeDuplicates(int arr[]) {
        if(arr.length <= 1)
            return arr.length;

        int idx = 0;

        // Scan entire array
        for(int i=0;i<arr.length-1;i++) {
            // If elements are unique
            if(arr[i] != arr[i+1]) {
                arr[idx] = arr[i];
                idx++;
            }
        }
        // Store last element
        arr[idx] = arr[arr.length-1];
        idx++;
        return idx;
    }

    
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        int ans = removeDuplicates(arr);

        System.out.println(ans);
        // for(int i=0;i<=ans;i++) {
        //     System.out.println(arr[i]);
        // }
      
    }
}
