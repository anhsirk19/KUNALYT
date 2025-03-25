package Sorting_techniques;

//https://leetcode.com/problems/missing-number/description/

public class Missingnumber {
    public static void main(String[] args) {
        int[] nums = {9,1,3,6,7,4,5,2,0};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] < nums.length && nums[i] != i){
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }else{
                i++;
            }
        }

        //finding missing number
        int j = 0;
        while(j < nums.length){
            if(nums[j] == j){
                j++;
            }else{
                break;
            }
        }
        return j;
    }
}
