import java.util.Scanner;

public class AverageofNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the N value:");
        int N = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            double num = in.nextInt();
            sum += num;
        }
        double average = (sum / N);
        System.out.println("average of N numbers is:" + average);
        in.close();
    }
}
