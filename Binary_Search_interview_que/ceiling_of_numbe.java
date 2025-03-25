package Binary_Search_interview_que;

public class ceiling_of_numbe {

        public static void main(String[] args) {
            int arr[] = { 2, 3, 5, 9, 14, 16, 18};
            int target = 15;
            
            int ans = Search(arr, target);
            System.out.println(ans);
        }

        // return the index of smallest number >= target
    
        static int Search(int[] arr, int target) {

            // but what if target is greatest number in the array
            if(target > arr[arr.length - 1]){
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
            return arr[s];
        }
    
}
