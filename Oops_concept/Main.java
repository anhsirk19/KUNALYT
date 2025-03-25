class Base {
    Base() {
      System.out.println("Base Class Constructor Called ");
    }
}
  
class Derived extends Base {
    Derived() {
      System.out.println("Derived Class Constructor Called ");
    }
}
  
public class Main {
    public static void main(String[] args) {
      Derived d = new Derived();
    }
}

 /* Inheritance and constructors in Java:

In Java, constructor of base class with no argument gets automatically called in derived class constructor.
For example, output of following program given below is:

Any class will have a default constructor, does not matter if we declare it in the class or not. If we inherit a class,
then the derived class must call its super class constructor. It is done by default in derived class.
If it does not have a default constructor in the derived class, the JVM will invoke its default constructor and call
the super class constructor by default. If we have a parameterised constructor in the derived class still it calls the
default super class constructor by default. In this case, if the super class does not have a default constructor,
instead it has a parameterised constructor, then the derived class constructor should call explicitly call the
parameterised super class constructor.*/