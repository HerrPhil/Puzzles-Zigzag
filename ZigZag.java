import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import java.math.BigInteger;

public class ZigZag {

    public static void main(String [] args) {
        System.out.printf("Hello Zig Zag Conversion Solution%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java ZigZag%n");
            return;
        }

        String input = "learnbydoing";
        
        ZigZag zigZag = new ZigZag(input);

        String result = zigZag.solution();

        System.out.printf("the zig zag solution of %s is %s%n", input, result);
    }

    private String input;

    public ZigZag(String input) {

        this.input = input;

    }

    public String solution() {

        return "TODO";

    }

}
