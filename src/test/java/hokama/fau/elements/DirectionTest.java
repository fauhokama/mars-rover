package hokama.fau.elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DirectionTest {

    @Test
    @DisplayName("N to W")
    void test_0() {
        Direction direction = Direction.N.left();
        Assertions.assertEquals(direction, Direction.W);
    }

    @Test
    @DisplayName("S to E")
    void test_1() {
        Direction direction = Direction.S.left();
        Assertions.assertEquals(direction, Direction.E);
    }

    @Test
    @DisplayName("W to N")
    void test_2() {
        Direction direction = Direction.W.right();
        Assertions.assertEquals(direction, Direction.N);
    }

    @Test
    @DisplayName("E to S")
    void test_3() {
        Direction direction = Direction.E.right();
        Assertions.assertEquals(direction, Direction.S);
    }

    @Test
    @DisplayName("N to S")
    void test_4() {
        Direction direction = Direction.N.turnAround();
        Assertions.assertEquals(direction, Direction.S);
    }

    @Test
    @DisplayName("W to E")
    void test_5() {
        Direction direction = Direction.W.turnAround();
        Assertions.assertEquals(direction, Direction.E);
    }


}
