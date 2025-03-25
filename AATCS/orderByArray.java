package AATCS;

import java.util.*;

class orderByArray {
    public static void sortByOrder(int[] arr1, int[] arr2) {
        // Step 1: Create a frequency map for arr1
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a result array
        List<Integer> result = new ArrayList<>();

        // Step 3: Traverse arr2 and add elements to the result in the order of arr2
        for (int num : arr2) {
            if (frequencyMap.containsKey(num)) {
                int count = frequencyMap.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
                frequencyMap.remove(num); // Remove the element from the map once added
            }
        }

        // Step 4: Add remaining elements from arr1 that are not in arr2, in sorted order
        for (int num : frequencyMap.keySet()) {
            int count = frequencyMap.get(num);
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
        }

        // Step 5: Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] arr2 = {2, 1, 8, 3};

        sortByOrder(arr1, arr2);  // The sorted output will follow the order of arr2
    }
}

