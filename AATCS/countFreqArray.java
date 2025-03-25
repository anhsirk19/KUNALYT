package AATCS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countFreqArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        frequency(nums);
    }

    static void freq(int[] nums) {
        boolean[] visit = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (visit[i] == true) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    visit[j] = true;
                    count++;
                }
            }

            System.out.println(nums[i] + " " + count);
        }

    }

    static void frequency(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        // System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
