package Recursion_Array;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = { 5,6,7,8,9,1,2,3};
        System.out.println(rotBS(arr, 5, 0, arr.length-1));
    }

    static int rotBS(int[] arr, int key, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(key >= arr[s] && key <= arr[mid]){
                return rotBS(arr, key, s, mid-1);
            }else{
                return rotBS(arr, key, mid+1, e);
            }
        }

        if(key >= arr[mid] && key <= arr[e]){
            return rotBS(arr, key, mid+1, e);
        }
        return rotBS(arr, key, s, mid-1);
    }
    
}
