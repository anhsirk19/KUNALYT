package Recursion_Array;
import java.util.*;
public class revArray {
    public static void main(String[] args) {
        int[] array = {1,0,-2,30,20,10,-99};
        reverse(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        Integer[] array2 = {1,0,-2,30,20,10,-99};
        Collections.reverse(Arrays.asList(array2));
        System.out.println(Arrays.toString(array2));
        //Java collections require wrapper classes instead of primitive data types.

    }
    static void reverse(int[] arr, int s, int e){
        if(s >= e){
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverse(arr, s+1, e-1);
    }
}
