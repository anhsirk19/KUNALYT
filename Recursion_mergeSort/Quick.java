package Recursion_mergeSort;
import java.util.*;
public class Quick {
    public static void main(String[] args) {
        int[] nums = {101,100,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int s = low;
        int e = high;

        while (s < e) {
            while (arr[s] <= pivot && s < high) {
                s++;
            }
            while (arr[e] > pivot && e > low) {
                e--;
            }
            if (s < e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }
        
        arr[low] = arr[e];
        arr[e] = pivot;
        return e;
    }
}
