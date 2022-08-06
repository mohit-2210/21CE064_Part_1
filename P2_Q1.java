public class Circle {
    double Radius;
    public Circle() {
        System.out.println("The Default constructor created.");
        Radius = 1;
    }
    public Circle(double R) {
        Radius =R;
        System.out.println("The Parameterized constructor is created");
    }
    public double getArea() {
        double Area= (3.14*(Radius*Radius));
        System.out.println("The Area of Circle is : "+ Area);
        return Area;
    }
    public double getPerimeter() {        
        double Perimeter = 2*(3.4*Radius);
        System.out.println("The Perimeter of Circle is : "+ Perimeter);
        return Perimeter;
    }
    public static void main(String[] args) {
        Circle c2 = new Circle();
        c2.getArea();
        c2.getPerimeter();
        
        Circle c1 = new Circle(64);
        c1.getArea();
        c1.getPerimeter();
    }
}
