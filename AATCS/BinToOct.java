package AATCS;

public class BinToOct {
    public static void main(String[] args) {
        String binaryString = "1100110"; // Example binary string
        
        // Step 1: Convert binary to decimal
        int decimalValue = Integer.parseInt(binaryString, 2);
        
        // Step 2: Convert decimal to octal
        String octalValue = Integer.toOctalString(decimalValue);

        octal("1100110");
    }

    static void octal(String s){
        int l = s.length();
        if(l % 3 == 1){
            s = "00" + s;
        }
        if(l % 3 == 2){
            s = "0" + s;
        }
        String ans = "";
        for(int i = 0 ; i < s.length() ; i = i+3){
            int temp = (s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0') * 1;
            ans = ans + Integer.toString(temp);
        }
        System.out.println(ans);
    }
}
