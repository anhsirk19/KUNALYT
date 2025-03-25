package Oops_concept.Interfaces;

public interface Electricengine extends Engine{

    @Override
    default void acc() {
        System.out.println("acce electrix engine");
    }

    @Override
    default void start() {
        System.out.println("start the electric engine");
    }

    @Override
    default void stop() {
        System.out.println("stop the electric engine");
    }
    
}
