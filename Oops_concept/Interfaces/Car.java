package Oops_concept.Interfaces;

public class Car implements Engine ,Brake, Media{

    @Override
    public void brake() {
        System.out.println("i brake");
    }

    @Override
    public void start() {
        System.out.println("i start");
    }

    @Override
    public void stop() {
        System.out.println("i stop");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate");
    }
    
}
