package Sorting_techniques;


//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class FindallDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(nums);
        
    }
    static List<Integer> missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }else{
                i++;
            }
        }

        //finding missing number
        List<Integer> ans = new ArrayList<>();
        int j = 0;
        while(j < nums.length){
            if(nums[j] == j+1){
                j++;
            }else{
                ans.add(nums[j]);
                j++;
            }
        }
        return ans;
    }

}