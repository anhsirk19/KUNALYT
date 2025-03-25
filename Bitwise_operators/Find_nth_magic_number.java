package Bitwise_operators;

//num    binary_rep     magic_number
//1         0001          5 ^0 = 1
//2         0010          5 ^1 = 5
//3         0011          5 ^0 + 5^1 = 6
//7         0111          5 ^0 + 5^1 + 5^2 = 31


public class Find_nth_magic_number {
    public static void main(String[] args) {
        System.out.println(magic(7));
    }

    static int magic(int num){
        int sum = 0 ;
        int count = 0;
        while(num > 0){
            if((num & 1) == 1){
                sum += Math.pow(5, count);
            }
            num >>= 1;
            count++;
        }
        return sum;
    }
}
