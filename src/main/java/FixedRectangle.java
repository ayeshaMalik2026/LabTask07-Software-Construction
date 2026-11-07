public class FixedRectangle implements Shape {
    private int width, height;

    public FixedRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}