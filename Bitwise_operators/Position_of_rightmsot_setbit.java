package Bitwise_operators;
//to find the position of right most set bit
//example : 101001000 ans is 4


public class Position_of_rightmsot_setbit {
    public static void main(String[] args) {
        System.out.println(position(89));
        easymethod(88);
    }
    static int position(int num){
        int count = 1;
        while ((num & 1) == 0) {
            num >>= 1;
            count++;
        }
        return count;
    }

    static void easymethod(int num){
        int ans = num & (-num);
        int count = 1;
        while((ans & 1) == 0){
            count++;
            ans >>= 1;
        }
        System.out.println(count);
    }
}
