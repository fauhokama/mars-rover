public class Grid {
    private final int x;
    private final int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isValidPosition(Position position) {
        if (position.getX() > this.x || position.getY() > this.y ) {
            return false;
        }
        return true;
    }

}
