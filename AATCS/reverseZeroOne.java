package AATCS;

public class reverseZeroOne {
    public static void main(String[] args) {
        int n = 1201300;
        int temp = 1;
        int ans = 0;

        while(n != 0){
            int d = n%10;
            if(d == 0){
                d = 1;
            }
            ans = d*temp + ans;
            temp = temp*10;
            n = n/10;
        }
        System.out.println(ans);
    }
}
