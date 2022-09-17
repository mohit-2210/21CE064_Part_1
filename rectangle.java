class rectangle extends GeometricObjects{
    private double Width;
    private double Height;
    public rectangle(){}
    
    public rectangle(double width, double height){
        this.Width = width;
        this.Height = height;
    }
    public rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        Width = width;
        Height = height;
    }
    public double getWidth() {
        return Width;
    }
    public void setWidth(double width) {
        Width = width;
    }
    public double getHeight() {
        return Height;
    }
    public void setHeight(double height) {
        Height = height;
    }
    double getArea() {
        double ArR = Width*Height;
        return ArR;
    }
    double getPerimeter(){
        double PerR = 2*(Width+Height);
        return PerR;
    }
}