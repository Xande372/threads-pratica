package TerminateAThread;

public class RaceMain {

    public static void main(String[] args) {
        
        Race race = new Race();

        Thread runner1 = new Thread(new Runner(race, "Corredor 1"));
        Thread runner2 = new Thread(new Runner(race, "Corredor 2"));
        Thread runner3 = new Thread(new Runner(race, "Corredor 3"));
    
        System.out.println("Começarrr...");

        runner1.start();
        runner2.start();
        runner3.start();
    }
}
