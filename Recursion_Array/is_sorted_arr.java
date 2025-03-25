package Recursion_Array;

public class is_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 6, 8};
        System.out.println(sorted(arr, 0));
        System.out.println(isSort(arr, 0));
        

    }

    static boolean sorted(int[] arr, int index){
       if(index == arr.length-1){
        return true;
       }

       return (arr[index] < arr[index+1]) && sorted(arr, index+1);
    }

    static boolean isSort(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSort(arr, index+1);
    }
}
//done
