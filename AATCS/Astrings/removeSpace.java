package AATCS.Astrings;

public class removeSpace {
    public static void main(String[] args) {
        String s = "Take you forward ";
        char[] arr = s.toCharArray();

        int count = 0;
        for(int i = 0  ; i < arr.length ; i++){
            if(arr[i] != ' '){
                arr[count] = str[i];
                count++;
            }
        }

    }
}
