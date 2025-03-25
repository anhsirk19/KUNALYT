package Bitwise_operators;

//to find xor of number from 0 t0 a, code : 12
//refer in dsa github notes , it forms a pattern 

//for specific range like from 3 to 9, code


public class xor_num {
    public static void main(String[] args) {
        // System.out.println(xor(8));
        

        //range xor a, b = xor(b) ^ xor(a-1)

        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }

    //this gives xor from 0 to a;
    static int xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a + 1;
        }
        return 0;
    }
}
