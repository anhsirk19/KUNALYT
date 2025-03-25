package AATCS.Astrings;

import java.util.*;

public class frequency {
    public static void main(String[] args) {
        // String s = "takeuforward";

        // char[] arr = s.toCharArray();

        // HashMap<Character, Integer> map = new LinkedHashMap<>();

        // for(char ch : arr){
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }

        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     if(entry.getValue() <= 1){
        //         System.out.println(entry.getKey() + " " + entry.getValue());
        //     }
        // }

        String s = "takeuforward";
        char[] arr = s.toCharArray();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() <= 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
