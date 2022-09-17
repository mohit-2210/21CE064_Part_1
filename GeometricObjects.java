import java.util.Scanner;
import java.util.Date;

public abstract class GeometricObjects{
    Scanner sc = new Scanner(System.in);
    String Color;
    boolean filled;
    Date dateCreated = new Date();
    public GeometricObjects() {}
    protected GeometricObjects(String color, boolean filled) {
        Color = color;
        this.filled = filled;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDatecreated() {
        return dateCreated;
    }
    public void setDatecreated(Date d) {
        this.dateCreated = d;
    }
//Abstract Methods
    abstract double getArea();
    abstract double getPerimeter();
}