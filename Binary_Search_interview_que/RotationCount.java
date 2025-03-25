package Binary_Search_interview_que;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,2,3};
        int pivot = findPivot(arr);
        System.out.println("rotation count: " + (pivot+1));

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
