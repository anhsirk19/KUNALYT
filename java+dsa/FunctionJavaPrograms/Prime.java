

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
        in.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i < Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    
     static boolean isPrime(int n) {
     // Corner case
     if (n <= 1)
      return false;
      
      // Check from 2 to sqrt(n)
      for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;
      
       return true;
      }

}
