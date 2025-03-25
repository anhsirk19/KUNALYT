package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(num));
        System.out.println(Arrays.toString(num));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int fact = 0;
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[i] == nums[j] && fact == 0){
                fact = 1;
                i++;
            }
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                fact = 0;
            }
        }
        return i+1;
    }
}
