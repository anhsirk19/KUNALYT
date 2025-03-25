package Bitwise_operators;

//a xor a = 0,,,,  a xor 0 = a



public class Find_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1 , 6, 7, 2, 3, 2, 5, 6, 1, 5, 3};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[] arr){
        int ans = 0;
        for(int i = 0 ; i < arr.length; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
