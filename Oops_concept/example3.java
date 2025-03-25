package Oops_concept;
//STATIC BLOCK
public class example3 {
    static int a = 4;
    static int b;

    //WILL ONLY RUN ONCE, WHEN THE FIRST ON=BG IS CREATED I.E WHEN THE CLASS LOADS ONCE
    static {
        System.out.println("i am in static block");
        b = a*5;
    }
    public static void main(String[] args) {
        // example3 obj = new example3();
        System.out.println(example3.a + " " + example3.b);

        example3.b += 3;

        // example3 obj1 = new example3();
        System.out.println(example3.a + " " + example3.b);

    }
}
