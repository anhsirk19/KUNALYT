package AATCS.Astrings;

public class sumString {
    public static void main(String[] args) {
        String s = "123xyz21n2";

        char[] arr = s.toCharArray();

        int sum = 0;

        String st = "";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                st = st + arr[i];
            } else {
                if(!st.isEmpty()){
                    sum = sum + Integer.parseInt(st);
                    st = "";
                }
            }
        }
        if(!st.isEmpty()){
            sum = sum + Integer.parseInt(st);
        }
        
        System.out.println(sum);
    }
}
