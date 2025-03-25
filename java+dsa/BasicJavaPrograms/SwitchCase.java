import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String fruit = in.next();

        // switch (fruit) {
        // case "mango":
        // System.out.println("yellow");
        // break;
        // case "banana":
        // System.out.println("green");
        // break;
        // case "grapes":
        // System.out.println("black");
        // break;
        // case "orange":
        // System.out.println("white");
        // break;
        // default:
        // System.out.println("please enter valid fruit?");\

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7, 8, 9 -> System.out.println("Sunday");
            default -> System.out.println("please enter a valid number");
        }

        in.close();
    }

}
