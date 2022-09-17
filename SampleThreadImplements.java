class thread implements Runnable{

    @Override
    public void run() {
        System.out.println("This is through implement : " + Thread.currentThread().getName());        
    }    
}

public class SampleThreadImplements {
    public static void main(String[] args) {
        
        thread t = new thread();
        Thread a = new Thread(t);
        a.start();
    }
}
