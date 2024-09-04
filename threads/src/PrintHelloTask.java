public class PrintHelloTask implements Runnable {

    private String name;

    public PrintHelloTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        // monitorando as threads podendo ser visualizado no JConsole.
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            System.out.println(name + "interrompida!");
            e.printStackTrace();
        }

        System.out.println("Hello, " + name + "!");
    }
}
