package Oops_concept.Interfaces;

public class CDplayer implements Media{

    @Override
    public void start() {
        System.out.println("start musiv");
    }

    @Override
    public void stop() {
        System.out.println("STOP MUSIC");
    }
    
}
