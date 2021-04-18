package hokama.fau;

import hokama.fau.parser.Parser;
import hokama.fau.parser.ParserEngine;

public class Exercise {
    public static void main(String[] args) {

        ParserEngine parserEngine = new ParserEngine();
        Parser parser = new Parser(parserEngine);

        String input =
                "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n" +
                "3 3 E\n" +
                "MMRMMRMRRM";

        parser.parse(input).start();

    }
}
