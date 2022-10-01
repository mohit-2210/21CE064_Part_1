import java.util.*;

public class Q4_P6 extends Thread{
    public void run(){
        System.out.println("Execution running : " + this.getPriority());
    }

    public static void main(String[] args){
        //creation of threads
        Q4_P6 FIRST = new Q4_P6();
        Q4_P6 SECOND = new Q4_P6();
        Q4_P6 THIRD = new Q4_P6();

        //setting the priority
        FIRST.setPriority(3);
        SECOND.setPriority(5); //default
        THIRD.setPriority(7);

        //running the threads
        SECOND.start();
        FIRST.start();
        THIRD.start();
    }
}