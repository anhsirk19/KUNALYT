package Recurion_Level1_que;

public class Product_digits {
    public static void main(String[] args) {
        System.out.println(digitProduct(562));
    }
    static int digitProduct(int n){
        if(n%10 == n){
            return n;
        }
        int d = n % 10;
        return d * digitProduct(n/10);
    }
}
