package Bitwise_operators;

//find sum of nth row in a pascal triangle
//example:
//          1
//        1   1
//      1   2   1
//    1   3   3   1
//  1   4   6   4   1
//1  5    10  10  5   1
//sum of each row = nc0 + nc1 + nc2 +    + ncn = 2^n


public class Pascal_Traingle {
    public static void main(String[] args) {
        System.out.println(row_sum(3));
    }
    static int row_sum(int n){
        int ans = 1 << (n-1);
        return ans;
    }
}
