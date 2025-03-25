public class Order_agnostic_bin_s {
    public static void main(String[] args) {
        int arr[] = { 90, 50, 40, 11, 9, 5, -1 };
        // int arr[] = { -18, -12, -4, 0, 2, 4, 9, 10, 12, 14, 20, 36, 48 };
        int target = -1;
        int index = Search(arr, target);
        if (index >= 0) {
            System.out.println("found at index:" + index);
        } else {
            System.out.println("index not found");
        }
    }

    static int Search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
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
