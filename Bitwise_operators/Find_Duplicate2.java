package Bitwise_operators;

//important

//if the numbers appearing 3 times, find the duplicate
//example : [2,3,2,2,7,7,8,7,8,8] ans is : 3

//for 5, 6, .. times take modulo by 5,6,.. respectively

public class Find_Duplicate2 {
    public static void main(String[] args) {
        int[] nums = { 2, 9, 2, 2, 7, 7, 8, 7, 8, 8 };
        System.out.println(find(nums));
    }

    static int find(int[] nums) {

        int result = 0;// This variable will store the single occurring number.(answer)

        // We iterate through each bit position in a number (assuming 32-bit integers).
        for (int i = 0; i < 32; i++) {

            int sum = 0; // This will store the sum of bits at position i across all numbers.

            for (int num : nums) {
                sum += (num >> i) & 1;
                // (num >> i) shifts the bits of num to the right by i positions.
                // The "& 1" operation isolates the bit at position i.
                // We add the isolated bit to the sum.
            }

            sum %= 3; // Taking the sum modulo 3 eliminates bits appearing in triplets.

            // Now, we set the corresponding bit in the 'result' using bitwise OR operation.
            // We shift the calculated sum by i positions and then set the bit in 'result'.
            result |= (sum << i);
        }
        return result;
    }
}
