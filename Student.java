import java.util.*;
import java.util.Scanner;

public class Student{
    private static final char[][] M = null;
    Scanner sc =new Scanner(System.in);
    int StudentId;
    String StudentName;
    int[] Marks;
    M = new Marks[3];
   
    public void getSId(){
        StudentId=sc.nextInt();
    }

    public void getSName(){
        StudentName=sc.next();
    }

    public void getMarks(){
        
        for(int i=0;i<3;i++){
            System.out.println("Enter your Marks"+i+" : ");
            M[i] = sc.nextInt();
        }
    }
    
    public void setSId(){
        System.out.println(StudentId);
    }

    public void setSName(){
        System.out.println(StudentName);
    }

    public void setMarks(){
        
        for(int i=0;i<3;i++){
            System.out.println("Enter your Marks"+i+" : ");
            System.out.println(M[i]);
        }
    }

    public static void main(String[] args) {
        Student S1,S2,S3;
        System.out.println("Enter Information of Student 1 :");
        S1.getSId();
        S1.getSName();
        S1.getMarks();
        S1.setSId();
        S1.setSName();
        S1.setMarks();

        System.out.println("Enter Information of Student 2 :");
        S2.getSId();
        S2.getSName();
        S2.getMarks();
        S2.setSId();
        S2.setSName();
        S2.setMarks();

        System.out.println("Enter Information of Student 3 :");
        S3.getSId();
        S3.getSName();
        S3.getMarks();
        S3.setSId();
        S3.setSName();
        S3.setMarks();

    }
}