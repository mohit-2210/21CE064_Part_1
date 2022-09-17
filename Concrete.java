public class Concrete implements Iprinter,Iscanner { 
  public void display1(){ 
    System.out.println("Display1"); 
  } 
  public void display2(){ 
    System.out.println("Display2"); 
  } 
  public static void main(String[] args) { 
    Concrete c = new Concrete(); 
    c.show1(); 
    c.display1(); 
    c.show2(); 
    c.display2(); 
  }
} 
