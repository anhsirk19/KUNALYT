package Accebture;
import java.util.*;
public class a9_mergesortArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 3, 6, 8};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i < n1){
            arr3[k++] = arr1[i++];
        }
        while(j < n2){
            arr3[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));

        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int q = 0 ; q < n1 ; q++){
            map.put(arr1[q], true);
        }

        for(int q = 0 ; q < n2 ; q++){
            map.put(arr2[q], true);
        }
        for (Map.Entry<Integer,Boolean> me : map.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }
}
