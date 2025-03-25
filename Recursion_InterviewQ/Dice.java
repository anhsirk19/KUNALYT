package Recursion_InterviewQ;
import java.util.ArrayList;
public class Dice {
    public static void main(String[] args) {
        combi("", 4);
        // ArrayList<String> list = combiAList("", 2);
        // System.out.println(list);
        System.out.println(combiCount("", 4));
        // System.out.println();
        // //if 7 faces are there in dice
        // combi("", 2, 2);
    }


    static void combi(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1 ; i <= 6 && i <= target; i++){
            combi(p+i, target-i);
        }
    }

    //if given custom dicefaces
    static void combi(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1 ; i <= face && i <= target; i++){
            combi(p+i, target-i, face);
        }
    }



    static ArrayList<String> combiAList(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i <= target; i++){
            ans.addAll(combiAList(p+i, target-i));
        }
        return ans;
    }

    static int combiCount(String p, int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for(int i = 1 ; i <= 6 && i <= target; i++){
            count = count + combiCount(p+i, target-i);
        }
        return count;
    }
}
