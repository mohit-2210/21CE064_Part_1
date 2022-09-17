public class InterfaceDefault implements MyInterface{
    public void square(int a) {
    System.out.println(a * a);
    }
    public static void main(String args[]) {
    InterfaceDefault obj = new InterfaceDefault();
    obj.square(4);
    obj.show(); // default method executes
    }
    }