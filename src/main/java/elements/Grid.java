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
       return (isNotNegative() && isLowerOrEqualThanGrid(position));
    }

    private boolean isNotNegative() {
        return (this.x <= 0 && this.y <= 0);
    }

    private boolean isLowerOrEqualThanGrid(Position position) {
        return (this.x <= position.getX() || this.y <= position.getY());
    }

}
