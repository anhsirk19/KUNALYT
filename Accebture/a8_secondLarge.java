package Accebture;

public class a8_secondLarge {
    public static void main(String[] args) {
        // int[] arr = {12, 35, 1, 10, 4, 1};
        // int max = Integer.MIN_VALUE;
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // int max2 = Integer.MIN_VALUE;
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] != max){
        //         max2 = Math.max(arr[i], max2);
        //     }
        // }
        // System.out.println(max2);

        //by using one pass

        int[] arr = {12, 45, 1, 23, 4, 1};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }else if(arr[i] > max2 && arr[i] < max){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
