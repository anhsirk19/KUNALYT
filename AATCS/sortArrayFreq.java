package AATCS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class sortArrayFreq {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 3, 1, 2};
        
        sortByFrequency(array);

    }

    private static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

     public static void sortByFrequency(int[] array) {
        // Step 1: Create a frequency map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : array) {
            // Count the frequency of each element
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from the original array
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        // Step 3: Sort the list by frequency and by first appearance if frequency is same
        list.sort((a, b) -> {
            // Compare by frequency (higher frequency first)
            int freqCompare = frequencyMap.get(b) - frequencyMap.get(a);
            if (freqCompare == 0) {
                // If frequencies are the same, maintain original order
                return Integer.compare(indexOf(array, a), indexOf(array, b));
            }
            return freqCompare;
        });

        // Step 4: Print the sorted elements
        for (int num : list) {
            System.out.print(num + " ");
        }

        list.sort((a, b) -> {
            int freq = map.get(b) - map.get(a);
            if(freq == 0){
                return Integer.compare(indexOf(array, a), indexOf(array, b));
            }
            return freq;
        });
    }
    
}
