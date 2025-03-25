package Oops_concept;
//InnerClasses
public class example4 {
    static class Test{
        String name;

        public Test(String name){
            this.name =  name;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("sai");
        Test b = new Test("krishna");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
    }
}
