package Arrays;
//https://leetcode.com/problems/maximum-subarray/description/
//Now here in this question you can see that you can also be asked some more things like :

//#Length of the max subarray
//#Elements of the max subarray
//#Start and End index of max subarray

public class Kadenes_Algo {
    public static void main(String[] args) {
        int[] nums = {-2 , 1, -3, 4, -1, 2, 1, -5 ,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(max < sum){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;

    }
}
