

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 3, 1, 4, 6, 5 };
        int n = arr.length;
        if (isPythagoreanTriplet(arr, n)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        in.close();
    }

    static boolean isPythagoreanTriplet(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];
                    if (x == y + z || y == x + z || z == y + x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
