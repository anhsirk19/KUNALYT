import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 400 == 0) {
            System.out.println("leap year");
        } else {
            if (year % 100 == 0) {
                System.out.println("not year");
            } else {
                if (year % 4 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not leap year");
                }
            }
        }

        in.close();

    }
}
