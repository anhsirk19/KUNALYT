package Maths;

//it is method for prime numbers in range

//time complexity  O(n*log(logn))

public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];//initially the values are false
        sieve(n, primes);
    }

    //false in array means number is prime
    static void sieve(int n, boolean[] primes){
        for(int i = 2; i*i <= n ; i++){
            if(!primes[i]){
                for(int j = i*2 ; j <= n ; j += i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2 ; i <=n ; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
