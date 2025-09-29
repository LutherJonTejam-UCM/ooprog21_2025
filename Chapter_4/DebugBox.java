public class DebugBox {

    private int width;
    private int length;
    private int height;

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public int getVolume() {
        return length * width * height;
    }
}
