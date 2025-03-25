package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,10,13};
        System.out.println(search(arr, 13, 0, arr.length - 1));
    }
    static int BS(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }

        if(arr[m] > target){
            return BS(arr, target, s, m-1);
        }
        return BS(arr, target, m+1, e);
    }

    static int search(int[] arr, int target, int l, int h){
        
        int mid = l + (h-l)/2;
        if(l > h){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return search(arr, target, mid+1, h);
        }
        return search(arr, target, l, mid-1);
    }
}
