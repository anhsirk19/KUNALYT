package Oops_concept.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l , double h, double w, double weight){
        //call the parent class constructor
        //used to initilize values present in parent class
        super(l, h, w);
        this.weight = weight;
        /*The parent class constructor needs to execute 
        before the child class can add its own fields or
         behaviors. This ensures the object is correctly 
         initialized in a top-down manner from the parent
          class to the child class.*/
    }
}
