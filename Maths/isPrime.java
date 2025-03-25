package Maths;

public class isPrime {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1 ; i <= n ; i++){
            System.out.println(i + " " +isprime(i));
        }
    }

    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        int i = 2;
        while(i * i <= n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
