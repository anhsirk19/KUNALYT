package AATCS;

public class maxminDigit {
    public static void main(String[] args) {
        int N = 23004;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(N != 0){
            int d = N%10;
            max = Math.max(d, max);
            min = Math.min(d, min);
            N = N/10;
        }

        System.out.println(max);
        System.out.println(min);
    }
}
