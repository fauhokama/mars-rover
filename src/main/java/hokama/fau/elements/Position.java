package hokama.fau.elements;

public class Position {
    private int x;
    private int y;
    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void update(Move move) {
        this.x += move.getX();
        this.y += move.getY();
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isValidPosition(Grid grid) {
        return (isNotNegative() && isLowerOrEqualThanGrid(grid));
    }

    // Checks position is > 0
    private boolean isNotNegative() {
        return (x >= 0 && y >= 0);
    }

    // Checks position is <= Grid Bounds.
    private boolean isLowerOrEqualThanGrid(Grid grid) {
        return (x <= grid.getX() && y <= grid.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction + " ";
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }

        if (!(comparedObject instanceof Position)) {
            return false;
        }

        Position comparedPosition = (Position) comparedObject;

        if (this.x == comparedPosition.x &&
                this.y == comparedPosition.y &&
                this.direction == comparedPosition.direction) {
            return true;
        }

        return false;
    }
}