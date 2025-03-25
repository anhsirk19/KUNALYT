package Bitwise_operators;

//given a number n , find the total number of set bits
//here will find the right most bits and remove them one by one

public class Total_set_bits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }
    static int setBits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
