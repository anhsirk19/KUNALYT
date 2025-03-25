package Sorting_techniques;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {2,-4,0,3,1,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }
    static int getMaxIndex(int[] arr, int start, int last){
        int max = 0;
        for(int i =1 ; i <= last ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
