import elements.Direction;
import elements.Grid;
import elements.Instruction;
import elements.Position;

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
            if (!grid.isValidPosition(position)) {
                throw new Error("Drone out of bounds!");
            }
        }
    }

    public void execute(Instruction instruction) {
        Direction direction = position.getDirection();
        switch (instruction) {
            case L:
                position.setDirection(direction.left());
                break;
            case R:
                position.setDirection(direction.right());
                break;
            case M:
                position.move(direction.move());

        }
    }

    public Position getPosition() {
        return position;
    }
}
