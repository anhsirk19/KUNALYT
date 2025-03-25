package Sorting_techniques;

import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length-1){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }else{
                i++;
            }
        }
    }
}