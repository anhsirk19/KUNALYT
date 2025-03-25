package AATCS;

import java.util.*;

public class rank {
    public static void main(String[] args) {
        int[] nums = {20,15,26, 26,2,98,6};

        int[] dup = nums.clone();

        Arrays.sort(dup);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;
        for(int n : dup){
            if(!map.containsKey(n)){
                map.put(n, rank);
                rank++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "=>" +  map.get(nums[i]) + " ");
        }

    }
}
