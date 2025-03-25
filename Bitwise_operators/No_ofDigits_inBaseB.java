package Bitwise_operators;

public class No_ofDigits_inBaseB {
    public static void main(String[] args) {
        int num = 17;
        int base = 16;//

        int ans = (int)(Math.log(num) / Math.log(base)) + 1;

        System.out.println(ans);
    }
}
