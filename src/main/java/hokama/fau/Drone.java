package hokama.fau;

import hokama.fau.elements.*;

import java.util.Queue;

public class Drone {

    private Position position;
    private Queue<Instruction> instructions;

    public Drone(Position position, Queue<Instruction> instructions) {
        this.position = position;
        this.instructions = instructions;
    }

    public void run(Grid grid) {
        for (Instruction i : instructions) {
            execute(i);
            checkOutOfBounds(grid);
        }
    }

    public void checkOutOfBounds(Grid grid) {
        Direction direction = position.getDirection();
        if (!grid.isValidPosition(position)) turn(direction.turnAround());
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
