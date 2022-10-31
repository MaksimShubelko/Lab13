public class Calculator {

    public double calculate(String input) {
        String[] inputParsed = input.split(" ");
        double numberFirst = Double.parseDouble(inputParsed[0]);
        String symbol = inputParsed[1];
        double numberSecond = Double.parseDouble(inputParsed[2]);
        return switch (Operation.fromString(inputParsed[1])) {
            case DIVISION -> numberFirst / numberSecond;
            case SUMMARY -> numberFirst + numberSecond;
            case PRODUCT -> numberFirst * numberSecond;
            case DIFFERENCE -> numberFirst - numberSecond;
        };
    }
}
