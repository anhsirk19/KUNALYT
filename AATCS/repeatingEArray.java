package AATCS;


import java.util.*;

public class repeatingEArray {
    public static void main(String[] args) {
        int[] arr = { 7,6, 3, 4, 2, 3, 4, 4, 5, 2 };
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
