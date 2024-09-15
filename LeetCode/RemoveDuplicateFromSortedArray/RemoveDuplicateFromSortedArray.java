public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();  //Instance of Solution class
        int a[] = {1, 1, 2, 3, 3, 4, 5, 6, 6};
        
        sol.removeDuplicates(a);  // Process the array and print unique values
    }
}

class Solution {
    public void removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return;  // Return if the array is empty
        }

        int count = 1;  // Start with the first unique element

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] != nums[count - 1]) 
            {
                nums[count] = nums[i];
                count++;
            }
        }
        // Print the unique values
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
