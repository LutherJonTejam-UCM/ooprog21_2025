public class DebugCircle {
    private int radius;
    private final double PI = 3.14159;
    private double area;
    
    public DebugCircle(int r) {
        radius = r;
        area = PI * r * r; 
    }

    public int getRadius() {
        return radius; 
    }

    public int getDiameter() {
        return 2 * radius; 
    }
    
    public double getArea() {
        return area; 
    }
