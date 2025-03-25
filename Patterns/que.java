package Patterns;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class que {
    public static void main(String[] args) {
        // pattern1(5);
        // System.out.println();
        // pattern2(4);
        // System.out.println();
        // pattern3(5);
        // System.out.println();
        // pattern4(5);
        // System.out.println();
        // pattern5(5);
        // System.out.println();
        // pattern28(5);
        // System.out.println();
        // pattern30(5);
        // System.out.println();
        // pattern17(4);
        // System.out.println();
        // pattern31b(4);
        // System.out.println();
        pattern31a(4);


    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n - row + 1; col > 0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row <= n ? row : 2 * n - row;
            for (int col = 1; col <= c; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            // int spaces = row <= n ? n - row : row - n;
            int c = row <= n ? row : 2 * n - row;
            int spaces = n - c;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            while (spaces != 0) {
                System.out.print("  ");
                spaces--;
            }
            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int spaces = row <= n ? n - row : row - n;
            int c = row > n ? 2 * n - row : row;
            while (spaces != 0) {
                System.out.print(" ");
                spaces--;
            }
            for (int col = c; col > 0; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern31b(int n) {
        int orginalN = n;
        n = n*2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int valueatindex = orginalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(valueatindex + " ");
            }
            System.out.println();
        }
    }

    static void pattern31a(int n) {
        int orginalN = n;
        n = (n-1)*2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int valueatindex = orginalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(valueatindex + " ");
            }
            System.out.println();
        }
    }

}
