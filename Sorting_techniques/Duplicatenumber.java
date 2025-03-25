package Sorting_techniques;


//https://leetcode.com/problems/find-the-duplicate-number/description/

public class Duplicatenumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if( nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }else{
                i++;
            }
        }

        //finding missing number
        int j = 0;
        while(j < nums.length){
            if(nums[j] == j+1){
                j++;
            }else{
                break;
            }
        }
        return nums[j];
    }
}
