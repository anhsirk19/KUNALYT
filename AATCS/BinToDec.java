package AATCS;

public class BinToDec {
    public static void main(String[] args) {
        String binaryString = "1101"; // Example binary string
        int decimalValue = Integer.parseInt(binaryString, 2); // Convert binary to decimal
        
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalValue);

        System.out.println(decimal(01010));
    }

    static int decimal(int n){
        String s = String.valueOf(n);
        System.out.println(s);
        int l = s.length();
        int ans = 0;
        int base = 1;
        for(int i = l-1 ; i >= 0 ; i--){
            if(s.charAt(i) == '1'){
                ans += base;
            }
            base = base*2;
        }
        return ans;

    }
}
