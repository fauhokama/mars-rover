package hokama.fau;

import hokama.fau.elements.*;

import java.util.Queue;

public class Drone {

    private final Position position;
    private Queue<Instruction> instructions;

    public Drone(Position position, Queue<Instruction> instructions) {
        this.position = position;
        this.instructions = instructions;
    }

    public Drone(Position position) {
        this.position = position;
    }

    public void run(Grid grid) {
        for (Instruction i : instructions) {
            execute(i);
            checkOutOfBounds(grid);
        }
    }

    public void checkOutOfBounds(Grid grid) {
        if (!position.isValidPosition(grid)) {
            turn(position.getDirection().turnAround());
            forward(getPosition().getDirection().move());
        }
    }

    public void execute(Instruction instruction) {
        Direction direction = position.getDirection();
        switch (instruction) {
            case L:
                turn(direction.left());
                break;
            case R:
                turn(direction.right());
                break;
            case M:
                forward(direction.move());
        }
    }

    public void turn(Direction direction) {
        position.setDirection(direction);
    }

    public void forward(Move move) {
        position.update(move);
    }

    public Position getPosition() {
        return position;
    }
}
