import java.io.*;   

public class P5_Q4{
    public static void main(String[] args) throws IOException{
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try {
            sourceStream = new FileInputStream("testFile1.txt");
            targetStream = new FileOutputStream ("f2.txt");
           
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }finally {
            if (sourceStream != null){
                sourceStream.close();   
            }
            if (targetStream != null){           
                targetStream.close(); 
            }
        }

        FileReader input = null;
        FileWriter output = null;
        
        try {
            input = new FileReader("testFile1.txt");
            output = new FileWriter("f2.txt");
            int c;
            while ((c = input.read()) != -1) {
                output.write(c);
            }
        }finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
