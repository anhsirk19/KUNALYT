import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int gcd = 1;
        for (int i = 1; (i <= n1 && i <= n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("HCF :" + gcd);
        int l = (n1 * n2) / gcd;
        System.out.println("LCM IS:" + l);
        in.close();
    }
}
