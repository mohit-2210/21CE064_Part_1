import java.io.*;
import java.util.*;

public class P5_Q3{
	
	public static void copyContent(File a, File b)
		throws Exception
	{
		FileInputStream input = new FileInputStream(a);
		FileOutputStream output = new FileOutputStream(b);

		try {
			int n;
			while ((n = input.read()) != -1) {
				// write() function to write
				// the byte of data
				output.write(n);
			}
		}
		finally {
			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
		}
		System.out.println("File Copied");
	}

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the source filename :");
		String a = sc.nextLine();

		File x = new File(a);

		System.out.println("Enter the destination filename :");
		String b = sc.nextLine();

		File y = new File(b);

		copyContent(x, y);
        sc.close();
	}
}
