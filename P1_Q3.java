import java.util.*;
import java.util.Scanner;;

public class P1_Q3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N1 = sc.nextInt();		//Taking Value from user for Number 1
		int N2 = sc.nextInt();		//Taking Value from user for Number 2
		N1 = N1%10;					//extracting the last digit of Number 1
		N2 = N2%10;					//extracting the last digit of Number 2
		if(N1==N2) {				//Checking for the last digit 
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}	
}
