package hokama.fau.elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    @DisplayName("0, 0 Grid")
    void test_0() {
        Grid grid = new Grid(0, 0);
        Position position = new Position(0, 0, Direction.N);

        Assertions.assertTrue(position.isValidPosition(grid));
    }

    @Test
    @DisplayName("0, 0 Grid. Out of Bounds")
    void test_1() {
        Grid grid = new Grid(0, 0);
        Position position = new Position(0, 1, Direction.N);

        Assertions.assertFalse(position.isValidPosition(grid));
    }

    @Test
    @DisplayName("0, 0 Grid. Negative Out of Bounds")
    void test_2() {
        Grid grid = new Grid(0, 0);
        Position position = new Position(-1, 0, Direction.N);

        Assertions.assertFalse(position.isValidPosition(grid));
    }

    @Test
    @DisplayName("0, 0 Grid. Both Out of Bounds")
    void test_3() {
        Grid grid = new Grid(0, 0);
        Position position = new Position(-1, 1, Direction.N);

        Assertions.assertFalse(position.isValidPosition(grid));
    }

    @Test
    @DisplayName("5, 5 Grid")
    void test_4() {
        Grid grid = new Grid(3, 3);
        Position position = new Position(2, 3, Direction.N);

        Assertions.assertTrue(position.isValidPosition(grid));
    }

    @Test
    @DisplayName("5, 5 Grid. Out of Bounds")
    void test_5() {
        Grid grid = new Grid(5, 5);
        Position position = new Position(6, 5, Direction.N);

        Assertions.assertFalse(position.isValidPosition(grid));
    }

    @Test
    @DisplayName("5, 5 Grid. Negative Out of Bounds")
    void test_6() {
        Grid grid = new Grid(5, 5);
        Position position = new Position(5, -5, Direction.N);

        Assertions.assertFalse(position.isValidPosition(grid));
    }

    @Test
    @DisplayName("Update Test")
    void test_7() {
        Move move = new Move(2, 2);
        Position expected = new Position(5, 5, Direction.N);
        expected.update(move);

        Assertions.assertEquals(expected, new Position(7, 7, Direction.N));

    }
}
