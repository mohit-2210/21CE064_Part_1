import java.io.*;
public class P5_Q1 {
    public static void main(String[] args) {
        String path = " ";  
        boolean flag = false;  
        try {  
             
            File file  = new File("testFile1.txt");  
            file.createNewFile();  

             
            File f2 = file.getCanonicalFile();  
              
            System.out.println(f2);  
            flag = f2.exists(); 
 
            path = f2.getAbsolutePath();  
            System.out.println(flag);  
  
            if (flag) {    
                System.out.println(path);  
                System.out.println(flag);
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
}
