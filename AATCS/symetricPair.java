package AATCS;

import java.util.HashMap;

public class symetricPair {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };
        System.out.println("The symmetric pairs are: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i][0] == nums[j][1] && nums[j][0] == nums[i][1]) {
                    System.out.print("(" + nums[i][1] + " " + nums[i][0] + ")" + " ");
                    break;
                }
            }
        }
    }

    static void usingHash(int[][] nums){
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int first = nums[i][0];
            int second = nums[i][1];

            if ( mp.get(second) == first) {
                System.out.print("("+first + " " + second+") ");
            } else {
                mp.put(first, second);
            }
        }
    }

}
