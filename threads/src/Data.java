public class Data {

    private boolean outOfSync;
    private int value;

    public boolean isOutOfSync() {
        return outOfSync;
    }

    public void setOutOfSync(boolean outOfSync) {
        this.outOfSync = outOfSync;
    }

    public int getValue() {
        return value;
    }
      
    public void setValue(int value) {
        this.value = value;
    }
    
    public synchronized void sync() {
        System.out.println("Sincronizando data...");
        
        try {
            if (!outOfSync)
                this.wait();
                
            outOfSync = false;
            Thread.sleep(5000);
            System.out.println("Sincronizado!");
            this.notifyAll();
            
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void read() {
        System.out.println("Lendo data...");

        try {
            if (outOfSync) 
                this.wait();

            Thread.sleep(2000);
            System.out.println("Data: " + value);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// os dados são lidos se estiverem sincronizados, pelo método wait.
// o método notifyAll evita Deadlocks.