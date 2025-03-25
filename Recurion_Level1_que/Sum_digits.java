package Recurion_Level1_que;

public class Sum_digits {
    public static void main(String[] args) {
        System.out.println(digitSum(99019));
    }
    static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        int d = n % 10;
        return d + digitSum(n/10);
    }
}
