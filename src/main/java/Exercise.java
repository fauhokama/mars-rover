public class Exercise {
    public static void main(String[] args) {

        String input =
                "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n" +
                "3 3 E\n" +
                "MMRMMRMRRM";

        Parser p = new Parser();

        p.parseController(input).start();
    }
}
