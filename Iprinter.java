interface Iprinter { 
  public int x=7; 
  void display1(); 
  default void show1(){ 
  System.out.println("This is default in interface"); 
  } 
} 
