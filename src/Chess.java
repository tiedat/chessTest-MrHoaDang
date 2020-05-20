

public class Chess {
    private boolean available;
    private int x;
    private int y;

    Chess() {
    }

    Chess(boolean available, int x, int y) {
        this.available = available;
        this.x = x;
        this.y = y;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    public boolean isValid(int fromX, int fromY, int toX, int toY) {
        if (toX == fromX && toY == fromY) {
            return false; //cannot move nothing
        }
        return toX >= 0 && toX <= 7 && fromX >= 0 && fromX <= 7 && toY >= 0 && toY <= 7 && fromY >= 0 && fromY <= 7;
    }
}
