package hokama.fau.elements;

public enum Direction {

    N() {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }

        @Override
        public Direction turnAround() {
            return S;
        }

        @Override
        public Move move() {
            return new Move(0, 1);
        }
    },

    W() {
        @Override
        public Direction left() {
            return S;
        }

        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction turnAround() {
            return E;
        }

        @Override
        public Move move() {
            return new Move(-1, 0);
        }
    },
    S() {
        @Override
        public Direction left() {
            return E;
        }

        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction turnAround() {
            return N;
        }

        @Override
        public Move move() {
            return new Move(0, -1);
        }
    },
    E() {
        @Override
        public Direction left() {
            return N;
        }

        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction turnAround() {
            return W;
        }

        @Override
        public Move move() {
            return new Move(1, 0);
        }
    };

    public abstract Direction left();

    public abstract Direction right();

    public abstract Direction turnAround();

    public abstract Move move();
}