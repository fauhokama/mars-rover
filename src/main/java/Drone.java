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
            if (i == Instruction.M) {
                move();
            } else {
                turn(i);
            }

            if (!grid.isValidPosition(position)) {
                throw new Error("Drone out of bounds!");
            }
        }
    }

    public void turn(Instruction instruction) {
        Direction direction = position.getDirection();
        int newDegree = (direction.getDegrees() + instruction.getN()) % 360;
        position.setDirection(direction.change(newDegree));
    }

    public void move() {
        switch (position.getDirection()) {
            case N:
                position.move(0, 1);
                break;
            case E:
                position.move(1,0);
                break;
            case S:
                position.move(0,-1);
                break;
            case W:
                position.move(-1,0);
                break;
        }
    }




    public Position getPosition() {
        return position;
    }
}
