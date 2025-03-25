package AATCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {

        int l = 6;
        int[] nums = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < l; i++) {
            nums[i] = in.nextInt();
        }
        // int[] ans = new int[l];
        // for (int n : nums) {
        // l--;
        // ans[l] = n;
        // }
        // System.out.println(Arrays.toString(ans));
        int i = 0;
        int j = l - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));

        int[] q = { 2, 3, 4, 0, -1 };

        Collections.reverse(Arrays.asList(q));

        System.out.println(Arrays.toString(q));
    }
}
