package hokama.fau.parser;

import hokama.fau.Controller;
import hokama.fau.Drone;
import hokama.fau.elements.Grid;
import hokama.fau.elements.Instruction;
import hokama.fau.elements.Position;

import java.util.ArrayList;
import java.util.Queue;

public class Parser {

    private ParserEngine parserEngine;

    public Parser(ParserEngine parserEngine) {
        this.parserEngine = parserEngine;
    }

    public Controller parse(String input) {
        String[] parts = input.split("\n");

        ArrayList<Drone> drones = new ArrayList<>();

        // no convencido de esto.
        int i = 1;
        while(i < parts.length) {
            Position position = parserEngine.position(parts[i]);
            i++;
            Queue<Instruction> instructions = parserEngine.instruction(parts[i]);
            i++;
            drones.add(new Drone(position, instructions));
        }

        Grid grid = parserEngine.grid(parts[0]);

        return new Controller(grid, drones);
    }
}
