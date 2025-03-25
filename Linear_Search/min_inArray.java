public class min_inArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0, 56 };
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
