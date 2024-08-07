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

        int numberOfRows = 4;
        String input = "learnbydoing";
        
        ZigZag zigZag = new ZigZag(numberOfRows, input);

        String result = zigZag.solution();

        System.out.printf("the zig zag solution of %s is %s%n", input, result);
    }

    private int numberOfRows;
    private String input;

    public ZigZag(int numberOfRows, String input) {

        this.numberOfRows = numberOfRows;
        this.input = input;

    }

    public String solution() {

        // declare the zig zag data structure
        List<List<Character>> zigZagDataStructure = new ArrayList<>();

        // initialize the zig zag data structure
        for (int i = 0; i < numberOfRows; i++) {

            zigZagDataStructure.add(new ArrayList<Character>());

        }

        char [] original = this.input.toCharArray();
        int currentRow = 0;
        int direction = 1;

        for (int index = 0; index < original.length; index++) {

            // get the next character
            char next = original[index];

            // get the current row and add the next character
            zigZagDataStructure.get(currentRow).add(Character.valueOf(next));


            // check whether to change direction
            if (currentRow == numberOfRows - 1) {

                direction *= -1;

            } else if (currentRow == 0 && index > 0) {

                direction *= -1;

            }

            // move to next row
            currentRow += 1 * direction;

        }

        // concantentate the rows, read values horizontally
        List<Character> result = new ArrayList<>();
        for (List<Character> row : zigZagDataStructure) {

            result.addAll(row);

        }

        return result
            .stream()
            .map(String::valueOf)
            .collect(Collectors.joining());

    }

}
