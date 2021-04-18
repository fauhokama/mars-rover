package elementsTest;

import elements.Direction;
import elements.Grid;
import elements.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GridTest {

    @Test
    @DisplayName("N to W")
    void test_0() {
        Grid grid = new Grid(0, 0);
        Position position = new Position(0, 0, Direction.N);

        Assertions.assertTrue(grid.isValidPosition(position));
    }
}
