package AATCS;

public class primeFactors {
    public static void main(String[] args) {
        int n = 60;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0 && isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
