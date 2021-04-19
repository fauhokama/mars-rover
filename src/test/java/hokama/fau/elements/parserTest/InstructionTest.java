package hokama.fau.elements.parserTest;

import hokama.fau.elements.Instruction;
import hokama.fau.parser.Parser;
import hokama.fau.parser.ParserEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static hokama.fau.elements.Instruction.*;

public class InstructionTest {

    private final ParserEngine parserEngine = new ParserEngine();
    private final Parser parser = new Parser(parserEngine);

    @Test
    @DisplayName("L Instruction Test.")
    void test_0() {

        String input = "LLLLL";

        Queue<Instruction> actual = parserEngine.instruction(input);
        List<Instruction> expected = new LinkedList<Instruction>(Arrays.asList(L, L, L, L, L));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("R Instruction Test.")
    void test_1() {

        String input = "RRRRR";

        Queue<Instruction> actual = parserEngine.instruction(input);
        List<Instruction> expected = new LinkedList<Instruction>(Arrays.asList(R, R, R, R, R));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("M Instruction Test.")
    void test_2() {

        String input = "MMMMM";

        Queue<Instruction> actual = parserEngine.instruction(input);
        List<Instruction> expected = new LinkedList<Instruction>(Arrays.asList(M, M, M, M, M));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("General Instruction Test.")
    void test_3() {

        String input = "LMRMLMR";

        Queue<Instruction> actual = parserEngine.instruction(input);
        List<Instruction> expected = new LinkedList<Instruction>(Arrays.asList(L, M, R, M, L, M, R));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Wrong Letters Instruction Test.")
    void test_4() {

        String input = "KLMMR";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            parserEngine.instruction(input);
        });
    }
}
