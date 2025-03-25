package Sorting_techniques;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class FindallNumbers {
    public static void main(String[] args) {
        int[] nums = {9,1,3,6,7,4,5,2,0};
        System.out.println(missingNumber(nums));
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
                ans.add(j+1);
                j++;
            }
        }
        return ans;
    }
}
