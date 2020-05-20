public class Bishop extends Chess {

    Bishop() {
    }

    public Bishop(boolean available, int x, int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(int fromX, int fromY, int toX, int toY) {
        if (!super.isValid(fromX, fromY, toX, toY)) {
            return false;
        }
        return Math.abs(toX - fromX) == Math.abs(toY - fromY);
    }
}

