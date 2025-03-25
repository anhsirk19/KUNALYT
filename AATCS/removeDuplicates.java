package AATCS;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int i = 0;
        for(int j = 1 ; j < arr.length ; j++){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }
        for(int k = i+1 ; k < arr.length ; k++){
            arr[k] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
