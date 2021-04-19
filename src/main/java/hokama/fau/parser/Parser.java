package hokama.fau.parser;

import hokama.fau.Controller;
import hokama.fau.Drone;
import hokama.fau.elements.Grid;
import hokama.fau.elements.Instruction;
import hokama.fau.elements.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Parser {

    private final ParserEngine parserEngine;

    public Parser(ParserEngine parserEngine) {
        this.parserEngine = parserEngine;
    }

    public Controller parse(String input) {
        String[] parts = input.split("\n");

        List<Drone> drones = new ArrayList<>();

        // Decides what kind of expression each part is. Implementation could be improved.
        int i = 1;
        while (i < parts.length) {
            // Position Expression
            Position position = parserEngine.position(parts[i]);
            i++;
            // Instruction Expression
            Queue<Instruction> instructions = parserEngine.instruction(parts[i]);
            i++;
            drones.add(new Drone(position, instructions));
        }

        // Grid Expression
        Grid grid = parserEngine.grid(parts[0]);

        return new Controller(grid, drones);
    }
}
