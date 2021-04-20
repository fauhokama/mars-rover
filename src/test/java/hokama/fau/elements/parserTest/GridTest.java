package hokama.fau.elements.parserTest;

import hokama.fau.elements.Grid;
import hokama.fau.parser.Parser;
import hokama.fau.parser.ParserEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GridTest {

    private final ParserEngine parserEngine = new ParserEngine();
    private final Parser parser = new Parser(parserEngine);

    @Test
    @DisplayName("0 0 Grid Test")
    void test() {

        String input = "0 0";

        Grid grid = parserEngine.grid(input);

        Assertions.assertEquals(0, grid.getX());
        Assertions.assertEquals(0, grid.getY());
    }

    @Test
    @DisplayName("Simple Grid Test")
    void test_0() {

        String input = "3 3";

        Grid grid = parserEngine.grid(input);

        Assertions.assertEquals(3, grid.getX());
        Assertions.assertEquals(3, grid.getY());
    }

    @Test
    @DisplayName("Big Grid Test")
    void test_1() {

        String input = "852 190";

        Grid grid = parserEngine.grid(input);

        Assertions.assertEquals(852, grid.getX());
        Assertions.assertEquals(190, grid.getY());
    }

    @Test
    @DisplayName("Negative x Grid Test")
    void test_2() {

        String input = "-3 8";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            parserEngine.grid(input);
        });
    }

    @Test
    @DisplayName("Negative y Grid Test")
    void test_3() {

        String input = "0 -2";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            parserEngine.grid(input);
        });
    }

    @Test
    @DisplayName("Negative x&y Grid Test")
    void test_4() {

        String input = "-124 -2";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            parserEngine.grid(input);
        });
    }
}
