class circle extends GeometricObjects{
    private double Radius;
    private double diameter;
    public circle(){}
    public circle(double radius) {
        Radius = radius;
    }
    protected circle(String color, boolean filled, double radius) {
        super(color, filled);
        Radius = radius;
    }
    public double getRadius() {
        return Radius;
    }
    public void setRadius(double radius) {
        Radius = radius;
    }
    public double getDiameter() {
        Double diameter = 2*Radius;
        return diameter;
    }
    double getArea() {
        double ArC = 3.14*Radius*Radius;
        return ArC;
    }
    double getPerimeter(){
        double PerC = 6.28*Radius;
        return PerC;
    }
}