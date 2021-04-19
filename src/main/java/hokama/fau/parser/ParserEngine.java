package hokama.fau.parser;

import hokama.fau.elements.Direction;
import hokama.fau.elements.Grid;
import hokama.fau.elements.Instruction;
import hokama.fau.elements.Position;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ParserEngine {

    public Grid grid(String input) {
        String[] tokens = interpret(input);
        int x = Integer.valueOf(tokens[0]);
        int y = Integer.valueOf(tokens[1]);
        if (x < 0 || y < 0) throw new IllegalArgumentException("Grid can't be negative.");
        return new Grid(x, y);
    }

    public Position position(String input) {
        String[] tokens = interpret(input);
        int x = Integer.valueOf(tokens[0]);
        int y = Integer.valueOf(tokens[1]);
        if (x < 0 || y < 0) throw new IllegalArgumentException("Position can't be negative.");
        Direction direction = Direction.valueOf(tokens[2]);
        if (direction == null) throw new IllegalArgumentException("Direction has to be N, W, S or E");
        return new Position(x, y, direction);
    }

    public Queue<Instruction> instruction(String input) {
        String[] tokens = interpret_instruction(input);
        Queue<Instruction> instructions = new LinkedList<>();
        Arrays.stream(tokens).forEach(i -> {
            Instruction instruction = Instruction.valueOf(i);
            if ( instruction == null) throw new IllegalArgumentException("Wrong Instruction Provided.");
            instructions.offer(instruction);
        });
        return instructions;
    }

    private String[] interpret(String input) {
        String[] tokens = input.split(" ");
        return tokens;
    }

    private String[] interpret_instruction(String input) {
        String[] tokens = input.split("");
        return tokens;
    }
}
