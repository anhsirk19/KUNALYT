import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        // System.out.println("sai");
        // Scanner in = new Scanner(System.in);
        // int roll = in.nextInt();
        // System.out.println("your roll is:" + roll);
        /*Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 1;
        while(num <=n){
            System.out.println(num);
            num++;
        }
        in.close();
    }

}