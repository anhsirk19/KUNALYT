package AATCS;

public class smallestNum {
    public static void main(String[] args) {
        int[] nums = { 1,-5, 5, -2, -5, 0, 11, 101, 99, 101 };

        int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // for (int num : nums) {
        //     if (num < small) {
        //         small = num;
        //     }
        //     if (num > max) {
        //         max = num;
        //     }
        // }
        int secondSmall = Integer.MAX_VALUE;
        int secondHigh = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < small){
                secondSmall = small;
                small = nums[i];
            }else if(nums[i] < secondSmall && nums[i] != small){
                secondSmall = nums[i];
            }
            if(nums[i] > max){
                secondHigh = max;
                max = nums[i];
            }else if(nums[i] > secondHigh && nums[i] != max){
                secondHigh = nums[i];
            }
        }


        // for (int i = 0; i < nums.length; i++) {
        //     if (secondSmall > nums[i] && nums[i] != small) {
        //         secondSmall = nums[i];
        //     }
        //     if (secondHigh < nums[i] && nums[i] != max) {
        //         secondHigh = nums[i];
        //     }
        // }
        System.out.println("small " + small);
        System.out.println("secondsmall " + secondSmall);
        System.out.println("large " + max);
        System.out.println("second large " + secondHigh);
    }
}
