package Recursion_Pattern;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,2,4};
        sort(arr,0,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int i, int j, int max){
        if(j == 0){
            return;
        }
        if(i < j-1){
            if(arr[i] > arr[max]){
                max = i;
            }
            sort(arr, i+1, j, max);
        }else{
            int temp = arr[j-1];
            arr[j-1] = arr[max];
            arr[max] = temp;
            sort(arr, 0, j-1, 0);
        }
    }
}
