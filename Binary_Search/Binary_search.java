public class Binary_search {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 14, 11 };
        int target = 1;

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

    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(target > arr[mid]){
                s = mid + 1;
            }else if(target < arr[mid]){
                e = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
