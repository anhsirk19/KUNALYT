package AATCS.Astrings;

import java.util.*;

public class maxchar {
    public static void main(String[] args) {
        String s = "applleel";
        usingHashMap(s);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char ans = arr[0];

        int max = 1;
        int count = 1;
        for(int i = 1 ; i < s.length() ; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count > max){
                max = count;
                ans = arr[i];
            }
        }
        System.out.println(ans);

    }

    static void usingHashMap(String s){
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max = 0;
        char ans = ' ';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        System.out.println(ans);
    }
}
