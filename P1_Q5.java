import java.util.Scanner;
import static java.lang.Math.min;
    public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first string : ");
    String S1=sc.next();
    System.out.println("Enter second string : ");
    String S2=sc.next();
    int n=stringMatch(S1,S2);
    System.out.println(n);
    }
    static int stringMatch(String x,String y){
        int count=0;
        int m=min(x.length(),y.length());
        for(int i=0;i<m-1;i++){
            String z=x.substring(i,i+2);
            String t=y.substring(i,i+2);
            if(z.equals(t)){
                count++;
                }
            }
            return count;
    }
}
