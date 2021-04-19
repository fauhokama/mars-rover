package hokama.fau;

import hokama.fau.parser.Parser;
import hokama.fau.parser.ParserEngine;

public class Exercise {
    public static void main(String[] args) {

        ParserEngine parserEngine = new ParserEngine();
        Parser parser = new Parser(parserEngine);

        // Insert input here:
        String input = "";

        parser.parse(input).start();

    }
}
