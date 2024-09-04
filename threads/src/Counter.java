public class Counter {

    public static void main(String[] args) {
        
        // Um problema comum é quando threads acessam o mesmo recurso;
        // Se uma thread modificar um recurso antes que outra acesse, o resultado poderá ser afetado.
        CounterTask task = new CounterTask();

        Thread counter1 = new Thread(task);
        Thread counter2 = new Thread(task);
        Thread counter3 = new Thread(task);
        Thread counter4 = new Thread(task);

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();
    }
}
