package Bitwise_operators;

//calculate a power b
// for example consider 3^6 = 3*3*3*3*3*3 time complexity = O(b)
//here we will make it to log(b)

public class Calculate_aPOWb {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        int ans = 1;

        while(power > 0){
            if((power & 1) == 1){
                ans = ans*base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}
