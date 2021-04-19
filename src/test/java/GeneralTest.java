import hokama.fau.parser.Parser;
import hokama.fau.parser.ParserEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class GeneralTest {

    private final ParserEngine parserEngine = new ParserEngine();
    private final Parser parser = new Parser(parserEngine);

    @Test
    @DisplayName("Provided Test")
    void providedTest() {

        // Provided case
        String input =
                "5 5\n" +
                        "1 2 N\n" +
                        "LMLMLMLMM\n" +
                        "3 3 E\n" +
                        "MMRMMRMRRM";

        String expected = "1 3 N 5 1 E";

        String actual = parser.parse(input).start().trim();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Simple Test")
    void simpleTest() {
        String input =
                "3 3\n" +
                        "0 0 S\n" +
                        "RRLLLM\n" +
                        "3 3 W\n" +
                        "MMM\n" +
                        "2 1 W\n" +
                        "MRMRM";

        String expected = "1 0 E 0 3 W 2 2 E";

        String actual = parser.parse(input).start().trim();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Bounds_0 Test")
    void bounds_0Test() {

        String input =
                "0 0\n" +
                        "0 0 N\n" +
                        "M\n";

        String expected = "0 0 S";

        String actual = parser.parse(input).start().trim();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Bounds_1 Test")
    void bounds_1Test() {
        String input =
                "4 2\n" +
                        "0 0 N\n" +
                        "MMM\n";

        String expected = "0 2 S";

        String actual = parser.parse(input).start().trim();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("No hokama.fau.Drone Test")
    void noDronesTest() {

        String input =
                "3 3";

        String expected = "";

        String actual = parser.parse(input).start().trim();

        Assertions.assertEquals(expected, actual);
    }
}
