package Binary_Search_interview_que;
//https://leetcode.com/problems/split-array-largest-sum/description/
public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        
    }
    public int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for(int i = 0 ; i < nums.length ; i++){
            start = Math.max(start, nums[i]);//it contains max element
            end = end + nums[i];//it contains sum of all elements
        }

        while(start < end){
            int mid = start + (end-start)/2;

            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //you cant  add this in this subarray
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces <= m){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return end;
    }
}
