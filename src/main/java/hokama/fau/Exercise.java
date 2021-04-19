package hokama.fau;

import hokama.fau.parser.Parser;
import hokama.fau.parser.ParserEngine;

public class Exercise {
    public static void main(String[] args) throws Exception {

        ParserEngine parserEngine = new ParserEngine();
        Parser parser = new Parser(parserEngine);

        // This is only for manually testing solutions.
        String input = "";
        String expected = "";

        String actual = parser.parse(input).start().trim();

        if (expected.equals(actual)) {
            System.out.println("Test passed");
        } else {
            throw new Exception("Test not passed");
        }
    }
}
