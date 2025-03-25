package Binary_Search_interview_que;

public class floor_of_number {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 1;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    // return the gratest number greater than or equal to target

    static int Search(int[] arr, int target) {

        //what if the target element is the smallest number
        if(target < arr[0]){
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[e];
    }
}
