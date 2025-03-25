// package FunctionJavaPrograms;

// import java.util.Scanner;

// public class PrimeNumbers {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int l = in.nextInt();
//         int u = in.nextInt();
//         for (int i = l; i <= u; i++) {
//             if(isPrime(i)){
//                 System.out.print(i + " ");
//             }
//         }
//         in.close();
//     }

//     static boolean isPrime(int n) {

//         if (n <= 1)
//             return false;
//         for (int i = 2; i <= Math.sqrt(n); i++)
//             if (n % i == 0)
//                 return false;
//         return true;

//     }

// }

// optimized "Sieve of Eratosthenes Method:"


import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter starting value:");
        int a = in.nextInt();
        System.out.println("enter ending value:");
        int b = in.nextInt();

        in.close();
        SieveOfEratosthenes(a, b);

    }

    static void SieveOfEratosthenes(int a, int b) {
        boolean[] prime = new boolean[b + 1];
        for (int i = 0; i <= b; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int p = 2; p * p <= b; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= b; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = a; i <= b; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
