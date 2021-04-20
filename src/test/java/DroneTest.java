import hokama.fau.Drone;
import hokama.fau.elements.Grid;
import hokama.fau.elements.Instruction;
import hokama.fau.elements.Move;
import hokama.fau.elements.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static hokama.fau.elements.Direction.*;

class DroneTest {

    private final Position position = new Position(1, 1, N);
    private final Drone drone = new Drone(position);


    @Test
    @DisplayName("Move")
    void test_0() {
        Move move = new Move(0, 1);
        drone.forward(move);

        Assertions.assertEquals(drone.getPosition(), new Position(1, 2, N));
    }

    @Test
    @DisplayName("Turn N to W")
    void test_1() {
        drone.turn(N.left());
        Assertions.assertEquals(drone.getPosition(), new Position(1, 1, W));
    }

    @Test
    @DisplayName("Execute an instruction R")
    void test_2() {
        drone.execute(Instruction.R);
        Assertions.assertEquals(drone.getPosition(), new Position(1, 1, E));
    }

    @Test
    @DisplayName("Out of Bounds Test")
    void test_3() {
        // Drone in 1 1 N. Grid is 1 1
        Grid grid = new Grid(1, 1);

        // If drone moves N, its going to be Out of Bounds.
        drone.forward(new Move(0, 1));

        // Drone should turnaround and face S.
        drone.checkOutOfBounds(grid);

        Assertions.assertEquals(drone.getPosition(), new Position(1, 1, S));
    }

}