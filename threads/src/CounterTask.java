// apenas printar e incrementar o contador.
public class CounterTask implements Runnable{

    private int counter;

    @Override
    public void run() {
        // garante que tudo dentro do bloco será executado apenas se não houver nenhuma thread executando esse bloco.
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + ": " + counter);
        }
    }
}
