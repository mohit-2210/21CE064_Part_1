public class TestGeometricObjects {
    public static void main(String[] args) {
    rectangle R1 =new rectangle(10,20);
    
    System.out.println("Area of Rectangle is : "+R1.getArea());
    System.out.println("Perimeter of Rectangle is : "+R1.getHeight());
    circle C1 = new circle(10);
    System.out.println("Area of circle is : "+C1.getArea());
    System.out.println("Perimeter of Circle is : "+C1.getPerimeter());
    System.out.println("Diameter of Circle is :"+C1.getDiameter());
    
    }
}