public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String penColor, String penPoint) {
        color = penColor;
        point = penPoint;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}
