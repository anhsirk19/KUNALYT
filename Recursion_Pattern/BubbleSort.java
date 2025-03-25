package Recursion_Pattern;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,2,4};
        sort(arr,0,arr.length-1); 
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c){
        if(c==0){
            return;
        }
        if(r < c){
            if(arr[r] > arr[r+1]){
                int temp = arr[r];
                arr[r] = arr[r+1];
                arr[r+1] = temp;
            }
            sort(arr, r+1, c);
        }else{
            sort(arr,0,c-1);
        }
    }
}
