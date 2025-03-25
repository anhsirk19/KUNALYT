package Recurion_Level1_que;

public class Count_zeros {
    public static void main(String[] args) {
        System.out.println(count(1200560700));
    }
    static int count(int n){
        return helper(n, 0);
    }
    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);

    }
}
