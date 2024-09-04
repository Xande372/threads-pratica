package TerminateAThread;

public class Runner implements Runnable{

    public Race race;
    public String runner;

    public Runner(Race race, String runner) {

        super();
        this.race = race;
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println(runner + "correndo...");

        while (!race.isFinished()) {
            race.setFinished(true);
            System.out.println("Vencedor: " + runner);
            return;
        }

        System.out.println(runner + " perdeu.");
    }
}
