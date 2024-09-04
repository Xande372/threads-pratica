public class PrintHelloTask implements Runnable {

    private String name;

    public PrintHelloTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + name + "!");
    }
}
