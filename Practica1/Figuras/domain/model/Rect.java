package domain.model;

public class Rect extends Square {
    public Rect(int newX, int newY, int newWidth, int newHeight) {
        super(newX, newY, newWidth);
        setHeight(newHeight);
    }

    public Rect(int newWidth, int newHeight) {
        this(0, 0, newWidth, newHeight);
    }

    private int height = 0;

    @Override

    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int newHeight) {
        if (newHeight >= 0)
            height = newHeight;
    }
}
