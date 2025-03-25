//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("congratulations " + name + " for your valuable impact!");
        in.close();
    }
}
