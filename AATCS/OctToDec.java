package AATCS;

public class OctToDec {
    public static void main(String[] args) {
        String binaryString = "1100"; // Example binary string
        int octalValue = Integer.parseInt(binaryString, 8); // Convert binary to decimal
        
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + octalValue);

        System.out.println(octal("1100"));

        // System.out.println(octal(1100110));
    }

    static int octal(String n){
        int base = 1;
        int ans = 0;
        for(int i = n.length()-1 ; i >= 0 ; i--){
            if(n.charAt(i) == '1'){
                ans += base;
            }
            base = base*8;
        }
        return ans;
    }
}
