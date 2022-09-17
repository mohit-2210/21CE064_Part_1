interface Iscanner { 
  public int y=7; 
  void display2(); 
  default void show2(){ 
  System.out.println("This is default in interface"); 
  } 
}
