public class HappyPrefix {
    public static void main(String[] args) {
        String s = "ababd";
        String se = "abcadaabababcabcabababd";
        System.out.println(kmp(se, s));
    }

    static boolean kmp(String Sen, String s){
        char[] se = Sen.toCharArray();
        char[] pattern = s.toCharArray();
        int[] lps =  LPS(s);

        int i = 0;
        int j = -1;
        while(i < se.length){
            if(se[i] == pattern[j+1]){
                i++;
                j++;
            }else if(j != 0){
                j = lps[j];
            }else{
                i++;
            }
            if(j == pattern.length-1){
                return true;
            }
        }
        return false;

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
