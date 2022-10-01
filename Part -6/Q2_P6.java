import java.util.Random;

class ThreadSample implements Runnable {
    int random[] = new int[15];
    ThreadSample(int a[]) {
        random = a;
    }

    void display() {
        if (Thread.currentThread().getName().equals("Thread-0")) {
            for (int i = 0; i < random.length; i++) {
                if(random[i]%2==0){
                System.out.println("Even Number --"+random[i]+" Identify by --"+Thread.currentThread().getName());
                }
            }
        }
        else{
            for (int i = 0; i < random.length; i++) {
                if(random[i]%2!=0){
                System.out.println("Odd Number --"+random[i]+" Identify by --"+Thread.currentThread().getName());
                }
            }
        }
    }

    public void run() {
        display();
    }
}

public class Q2_P6{
    public static void main(String[] args) {
        Random r = new Random();
        int random[] = new int[15];
        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt(100);
        }
        ThreadSample ts1 = new ThreadSample(random);
        Thread k = new Thread(ts1);
        k.start();
        Thread k1 = new Thread(ts1);
        k1.start();
    }
}