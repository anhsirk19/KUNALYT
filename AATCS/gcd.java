package AATCS;

public class gcd {
    public static void main(String[] args) {
        int n1 = 21;
        int n2 = 6;

        System.out.println(gcd(n1, n2));
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
