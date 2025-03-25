package Maths;

import java.util.ArrayList;

public class Factors_ofNum {
    public static void main(String[] args) {
        factors1(20);
        factors2(36);
        factors3(36);
    }
    
    //O(N)
    static void factors1(int n){
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //O(sqrt(N))
    static void factors2(int n){
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
        System.out.println();
    }

    // both time and space with be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

}
