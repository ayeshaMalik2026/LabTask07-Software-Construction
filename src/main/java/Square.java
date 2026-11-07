public class Square extends Rectangle {
    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException("Width and height must be equal for a square!");
        }
        super.setDimensions(w, h);
    }
}