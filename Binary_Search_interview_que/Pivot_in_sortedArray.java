package Binary_Search_interview_que;

public class Pivot_in_sortedArray {
    public static void main(String[] args) {
        int[] arr = { 2,9,2,2,2};
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

    static int findPivot(int[] a){
        int s = 0;
        int e = a.length - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(a[mid] < a[s]){
                e = mid -1;
            }else if(a[mid] > a[s]){
                s = mid;
            }else if(a[mid] < a[e]){
                s = mid + 1;
            }else{
                return s;
            }
        }
        return s;
    }
}
