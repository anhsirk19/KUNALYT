public class search_in2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 39, 56},
            {18, 12}
        };
        int target = 1;
        System.out.println(search(arr, target));
        System.out.println(max(arr, target));
    }
    static boolean search(int[][] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    static int max(int[][] arr, int target){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
