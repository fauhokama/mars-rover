public enum Direction {
    N (0),
    W (90),
    S (180),
    E (270);

    private final int degrees;

    Direction(int degrees) {
        this.degrees = degrees;
    }

    public int getDegrees() {
        return this.degrees;
    }

    public Direction change(int degrees) {
        switch (degrees) {
            case 0:
                return Direction.N;
            case 90:
                return Direction.W;
            case 180:
                return Direction.S;
            case 270:
                return Direction.E;
        }

        return null;
    }
}
