package elementsTest;

import hokama.fau.elements.Direction;
import hokama.fau.elements.Position;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    @DisplayName("No movement")
    void test_0() {
        Position position = new Position(5,  5, Direction.N);
    }
}
