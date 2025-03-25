package Bitwise_operators;

public class Find_Duplicate1 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -5, 5, -1, -3, -97 };
        System.out.println(duplicate(arr));

    }

    static int duplicate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
