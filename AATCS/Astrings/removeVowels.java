package AATCS.Astrings;

public class removeVowels {
    public static void main(String[] args) {
        String str = "take u forward";

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                str = str.substring(0, i) + str.substring(i+1);
            }
        }

        System.out.println(str);

        String s = " take u forward   !  ";
        s = s.replaceAll("\\s+", "");
        System.out.println(s);

        String st = "take12% *&u ^$#forward";
        String stq = "";
        for(char ch : st.toCharArray()){
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                stq = stq + ch;
            }
        }
        System.out.println(stq);
    }
}
