package AATCS.Astrings;

public class calculate {
    public static void main(String[] args) {

        String s = "Take u forward is Awesome";
        s = s.toLowerCase();

        
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else if(ch >= 'a' && ch <= 'z'){
                consonants++;
            }else{
                spaces++;
            }
        }

        System.out.println(s);

        String str = "Java Programming";
        System.out.println(str.replace('a', 'o'));
        System.out.println(str);

        System.out.println("vowels" + vowels);
        System.out.println("consonants" + consonants);
        System.out.println("spaces" + spaces);


    }
}
