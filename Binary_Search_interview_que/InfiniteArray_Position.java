//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

package Binary_Search_interview_que;

public class InfiniteArray_Position {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        //for finding the range
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return Search(arr, target, start, end);
    }
    static int Search(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
