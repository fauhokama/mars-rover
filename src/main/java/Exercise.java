// element.Instructions:
// Don't use external libraries. (except JUnit)

// Drone's position: X Y Letter. Example: 2 3 S
// Possible commands: R, L or M.

// Test Input:
// 5 5			Initial position
// 1 2 N		First Drone
// LMLMLMLMM	First Drone element.Instructions
// 3 3 E		Second Drone
// MMRMMRMRRM	Second Drone element.Instructions

public class Exercise {
    public static void main(String[] args) {
        Parser parser = new Parser();

        String input =
                "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n" +
                "3 3 E\n" +
                "MMRMMRMRRM";

        Controller controller = parser.parseController(input);

        controller.start();
    }
}
