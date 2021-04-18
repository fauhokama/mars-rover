import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeneralTest {

    private Parser parser;

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

        Parser parser = new Parser();

        Assertions.assertEquals("1 0 E 0 3 W 2 2 E", parser.parseController(input));
    }

    @Test
    @DisplayName("Bounds_0 Test")
    void bounds_0Test() {

        String input =
                "0 0\n" +
                        "0 0 N\n" +
                        "M\n";

        Assertions.assertThrows(Error.class, () -> {
            parser.parseController(input);
        });
    }

    @Test
    @DisplayName("Bounds_1 Test")
    void bounds_1Test() {
        String input =
                "4 2\n" +
                        "0 0 N\n" +
                        "MMMRM\n";

        Assertions.assertThrows(Error.class, () -> {
            parser.parseController(input);
        });
    }

    @Test
    @DisplayName("No Drone Test")
    void noDronesTest() {

        String input =
                "3 3";

        Assertions.assertEquals("", parser.parseController(input));
    }


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

        Assertions.assertEquals("1 3 N 5 1 E", parser.parseController(input));
    }
}
