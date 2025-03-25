package war;

import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n1 and n2");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if (n1 < 2 || n2 > 10000) {
            System.out.println("invaai");
        } else {
            range(n1, n2);
        }
        in.close();
    }

    static void range(int n1, int n2) {
        int count = 1;
        for (int i = n1; i <= n2; i++) {
            if (isprime(i)) {
                count++;
                if(count % 2 == 0){
                    System.out.print( i + " ");
                }
            }
        }
    }

    static boolean isprime(int n) {
        int x = 2;
        while (x * x <= n) {
            if (n % x == 0) {
                return false;
            }
            x++;
        }
        return true;
    }
}
