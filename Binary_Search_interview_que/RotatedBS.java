package Binary_Search_interview_que;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int ser(int[] nums, int target){
        int pivot = findPivot(nums);
        //if you did not find a pivot, it means the array is not roatated
        if(pivot == -1){
            Search(nums, target, 0, nums.length - 1);
        }
        /// if pivot is found you hava 2 asc sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }else if(target >= nums[0]){
            return Search(nums, target, 0, pivot - 1);
        }else{
            return Search(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int findPivot(int[] a){
        int s = 0;
        int e = a.length - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            
            if(a[mid] > a[mid+1]){
                return mid;
            }else if(a[mid] < a[mid-1]){
                return mid-1;
            }
            if(a[mid] >= a[s]){
                s = mid + 1;
            }else{
                e = mid -1;
            }
        }
        //if the array is not rotated just return the last index which is peak
        //or  return -1 it indicates that it is not raotated
        return e;
    }

    static int Search(int[] arr, int target, int start, int end) {
        int s = start;
        int e = end;
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
