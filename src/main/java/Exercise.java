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
