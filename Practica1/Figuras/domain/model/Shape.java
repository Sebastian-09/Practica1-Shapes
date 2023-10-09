package domain.model;

public abstract class Shape {
    private int x = 0;
    public int y = 0;

    // Prmer constructor
    public Shape(int newX, int newY) {
        setX(newX);
        setY(newY);
    }

    // Segundo constructor
    public Shape() {

    }

    // Tercer constructor
    public int getAdd() {
        return x + y;
    }

    // Metodo para cambiar el atributo
    public void setX(int newX) {
        if (newX >= 0 && newX <= 1000)

            x = newX;

    }

    public void setY(int newY) {
        if (newY >= 0 && newY <= 1000)

            y = newY;

    }

    // Metodo para obtener el atributo

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract int getArea();

    public abstract int getPerimeter();
}
