package Binary_Search_interview_que;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Mountain {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr) {
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
}
