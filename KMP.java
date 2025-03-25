
public class KMP {

    public static void main(String[] args) {
        String s = "ababd";
        String se = "abcadaabababcabcabababd";
        System.out.println(kmp(se, s));
    }

    static int kmp(String Sen, String s){
        char[] se = Sen.toCharArray();
        char[] pattern = s.toCharArray();
        int[] lps =  LPS(s);

        int i = 0;
        int j = 0;
        while(i < se.length){
            if(se[i] == pattern[j]){
                i++;
                j++;
            }else if(j != 0){
                j = lps[j-1];
            }else{
                i++;
            }
            if(j == pattern.length){
                return j - pattern.length;
            }
        }
        return -1;

    }

    static int[] LPS(String s){
        char[] pattern = s.toCharArray();
        int[] lps = new int[pattern.length];
        int comp = 0;
        lps[0] = comp;
        for(int i = 1 ; i < pattern.length ; i++){
            if(pattern[i] == pattern[comp]){
                comp++;
                lps[i] = comp;
            }else{
                comp = 0;
                lps[i] = comp;
            }
        }
        return lps;
    }
}
