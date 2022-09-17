
class thread extends Thread{
    public void run(){
        System.out.println("This is through Extending the tThread class : " + Thread.currentThread().getName());
    }
}

public class SampleThreadExtend {
    public static void main(String[] args) {
        thread t = new thread();
        t.start();
    }
}
