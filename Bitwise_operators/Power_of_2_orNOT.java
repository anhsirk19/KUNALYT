package Bitwise_operators;

//find if a number is power of 2 or not

//example : n = 8 => 1000
//          n = 7 => 0111
//          n & (n-1) => 0

public class Power_of_2_orNOT {
    public static void main(String[] args) {
        int n = 9;
        if((n & (n-1)) == 0){
            System.out.println("power of 2");
        }else{
            System.out.println("not pow of 2");
        }
    }
}
