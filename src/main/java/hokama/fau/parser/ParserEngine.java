package hokama.fau.parser;

import hokama.fau.elements.Direction;
import hokama.fau.elements.Grid;
import hokama.fau.elements.Instruction;
import hokama.fau.elements.Position;

import java.util.LinkedList;
import java.util.Queue;

public class ParserEngine {

    public Grid grid(String input) {
        String[] tokens = interpret(input);
        int x = Integer.valueOf(tokens[0]);
        int y = Integer.valueOf(tokens[1]);
        return new Grid(x,y);
    }

    public Position position(String input) {
        String[] tokens = interpret(input);
        int x = Integer.valueOf(tokens[0]);
        int y = Integer.valueOf(tokens[1]);
        Direction direction = direction_helper(tokens[2]);
        return new Position(x, y, direction);
    }

    public Queue<Instruction> instruction(String input) {
        String[] tokens = interpret(input);
        Queue<Instruction> instructions = new LinkedList<>();

        for (String c: tokens) {
            instructions.offer(instruction_helper(c));
        }
        return instructions;
    }

    // No convencido de esto.
    public Direction direction_helper(String c) {
        switch(c) {
            case "N":
                return Direction.N;
            case "W":
                return Direction.W;
            case "S":
                return Direction.S;
            case "E":
                return Direction.E;
        }
        return null;
    }

    // No convencido de esto.
    public Instruction instruction_helper(String c) {
        switch(c) {
            case "L":
                return Instruction.L;
            case "R":
                return Instruction.R;
            case "M":
                return Instruction.M;
        }
        return null;
    }

    private String[] interpret(String input) {
        String[] tokens = input.replaceAll(" ", "").split("");
        return tokens;
    }

}
