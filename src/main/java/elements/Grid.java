package elements;

import elements.Position;

public class Grid {
    private final int x;
    private final int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isValidPosition(Position position) {
       return (isNotNegative(position) && isLowerOrEqualThanGrid(position));
    }

    private boolean isNotNegative(Position position) {
        return (position.getX() >= 0 && position.getY() >= 0);
    }

    private boolean isLowerOrEqualThanGrid(Position position) {
        return (position.getX() <= this.x && position.getY() <= this.y);
    }

}
