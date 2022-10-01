class thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("HELLO WORLD");        
    }    
}

public class SampleThreadImplements {
    public static void main(String[] args) {
        
        thread1 t = new thread1();
        t.run();
    }
}
