import java.util.Scanner;

public class AlphbetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.nextLine().trim().charAt(0);//next is used to take string until a space encounterd
        //nextline() is used to take full sentence until /n or new line occurs
        if (ch >= 'a' && ch <= 'z') {//comparing its Unicode value (which aligns with ASCII values for standard English characters) 
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }
        in.close();
    }
}
