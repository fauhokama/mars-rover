import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Parser {

    public Controller parseController(String input) {
        String[] parts = input.split("\n");
        Grid grid = parseGrid(parts[0]);

        String[] newArray = Arrays.copyOfRange(parts, 1, parts.length);
        ArrayList<Drone> drones = parseDrones(newArray);

        return new Controller(grid, drones);
    }

    public Grid parseGrid(String input) {
        char[] coordinates = input.replaceAll(" ", "").toCharArray();
        int x = Character.getNumericValue(coordinates[0]);
        int y = Character.getNumericValue(coordinates[1]);
        return new Grid(x,y);
    }

    public ArrayList<Drone> parseDrones(String[] input) {
        ArrayList<Drone> drones = new ArrayList<>();

        int i = 0;
        while(i < input.length) {
            String row = input[i];
            Position position = parsePosition(row);
            i++;

            String rowx = input[i];
            Queue<Instruction> instructions = parseInstruction(rowx);
            i++;

            drones.add(new Drone(position, instructions));
        }

        return drones;
    }



    public Position parsePosition(String row) {
        char parts[] = row.replaceAll(" ", "").toCharArray();
        int x = Character.getNumericValue(parts[0]);
        int y = Character.getNumericValue(parts[1]);
        int dir = Character.getNumericValue(parts[2]);

        Direction direction = helper(parts[2]);
        return new Position(x, y, direction);
    }

    public Queue<Instruction> parseInstruction(String row) {
        char[] letters = row.toCharArray();
        Queue<Instruction> instructions = new LinkedList<>();

        for (char c: letters) {
            instructions.offer(helper2(c));
        }

        return instructions;
    }

    // TODO. Estoy seguro que no necesito esto, pero es para seguir avanzando.
    public Direction helper(char c) {
        switch(c) {
            case 'N':
                return Direction.N;
            case 'W':
                return Direction.W;
            case 'S':
                return Direction.S;
            case 'E':
                return Direction.E;
        }

        return null;
    }

    public Instruction helper2(char c) {
        switch(c) {
            case 'L':
                return Instruction.L;
            case 'R':
                return Instruction.R;
            case 'M':
                return Instruction.M;
        }
        return null;
    }

}
