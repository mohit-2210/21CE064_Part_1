import java.util.*;
import java.util.Scanner;

class intAdd{
    public void Add(int a,int b) {
        System.out.println(a+b);
        
    }
}

class StringAdd extends intAdd{
    public void Add(String s1, String s2){
        System.out.println(s1+" "+s2);
    }
}

public class overriding{
    public static void main(String[] args) {
        intAdd A1 = new intAdd();
        StringAdd S1 = new StringAdd();

        //Overriding the meathod "Add()" 
        A1.Add(5,3);
        S1.Add("Hello","World");
    }    
}