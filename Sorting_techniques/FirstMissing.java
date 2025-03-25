package Sorting_techniques;

//https://leetcode.com/problems/first-missing-positive/description/ 

public class FirstMissing {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        missing(nums);
    }
    static int missing(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]) {
            int temp = nums[i];
            nums[i] = nums[temp-1];
            nums[temp-1] = temp;
            }
            else{
                i++;
            }
        }


        int j = 0; // Start from 1 as we are looking for the first missing positive intege
        while (j < nums.length && nums[j] == j+1) {
            j++;
        }
        return j+1;
    }
}
