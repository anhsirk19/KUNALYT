package Binary_Search_interview_que;
//non-decreasing order
//https://leetcode.com/problems/find-in-mountain-array/
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int t = peakIndexInMountainArray(arr);
        int ans = Search(arr, target, 0, t);
        if(ans == -1){
            ans = Search(arr, target, t+1, arr.length-1);
        }
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans
                e = mid;
            } else{
                // you are in asc part of the array
                s = mid + 1;
            }
        }
        //start and end always tries to find the max element
        //hence, when they are pointing to just one element
        return s;// return e;
    }
    static int Search(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            boolean isAsc = arr[s] < arr[e];
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target > arr[mid]) {
                    s = mid + 1;
                } else if (target < arr[mid]) {
                    e = mid - 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    e = mid - 1;
                } else if (target < arr[mid]) {
                    s = mid + 1;
                }
            }
        }

        return -1;
    }
}
