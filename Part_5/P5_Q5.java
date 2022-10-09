import java.util.*;
import java.io.*;

public class P5_Q5{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int random[] = new int[15];
        File file  = new File("Even.txt");
        for (int i = 0; i < 15; i++) {
            random[i] = sc.nextInt();
            
            FileWriter wr = new FileWriter(file, true);
            if(random[i] % 2 == 0){
                wr.write(random[i] + " "); 
            }
            wr.close();
        }

        FileReader fr = new FileReader(file);
        int k;
        System.out.println("Reading the file data : ");
        while ((k = fr.read()) != -1){
            System.out.print((char)k);
        }
        fr.close();
        sc.close();
    }
}