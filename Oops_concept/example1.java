package Oops_concept;

public class example1 {
    public static void main(String[] args) {
        Student s1 = new Student(12, "krishna", 12.5f);
        System.out.println(s1.name);
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        Student s3 = new Student();
        System.out.println(s3.name);
    }
}
//a class is a named group of properties and functions
class Student{
    int rno;
    String name = "sai";
    float marks;

    Student (int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(){
        //this is how you call constructor from another constructor
        this(0, "default", 999.9f);
    }

    Student (Student oth){
        this.name = oth.name;
    }

    void greeting(){
        System.out.println("good night my name is " + this.name);
    }
}
