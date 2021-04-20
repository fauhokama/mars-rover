package hokama.fau.elements.parserTest;

import hokama.fau.elements.Position;
import hokama.fau.parser.Parser;
import hokama.fau.parser.ParserEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static hokama.fau.elements.Direction.N;
import static hokama.fau.elements.Direction.W;

public class PositionTest {

    private final ParserEngine parserEngine = new ParserEngine();
    private final Parser parser = new Parser(parserEngine);

    @Test
    @DisplayName("1 1 N Position Test.")
    void test_0() {

        String input = "1 1 N";

        Position expected = parserEngine.position(input);

        Assertions.assertEquals(expected, new Position(1, 1, N));
    }

    @Test
    @DisplayName("0 0 W Position Test.")
    void test_1() {

        String input = "0 0 W";

        Position expected = parserEngine.position(input);

        Assertions.assertEquals(expected, new Position(0, 0, W));
    }

    @Test
    @DisplayName("-1 -1 E Position Test. Negative Position")
    void test_2() {

        String input = "-1 -1 E";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            parserEngine.position(input);
        });
    }

    @Test
    @DisplayName("2 3 L Position Test. Wrong Direction.")
    void test_3() {

        String input = "2 3 L";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            parserEngine.position(input);
        });
    }


}
