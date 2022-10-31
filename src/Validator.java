public class Validator {
    private static String numberRegex = "^-?[0-9]*[.,][0-9]+$";
    private static String operationRegex = "[/*+-]";

    public boolean validate(String input) throws IncorrectInputTypeException, NumbersTooLongException, DivisionByZeroException {
        String[] parsedInput = input.split("\s");
        if (parsedInput.length != 3 || !(isNumberMatch(parsedInput[0]) && isNumberMatch(parsedInput[2]))) {
            throw new IncorrectInputTypeException("Incorrect input type");
        } else {
            if (parsedInput[0].chars().count() >= 9 || parsedInput[0].chars().count() >= 9) {
                throw new NumbersTooLongException("Numbers are too long");
            } else {
                if (!isOperationMatch(parsedInput[1])) {
                    throw new IncorrectInputTypeException("Incorrect operation type");
                } else {
                    if (parsedInput[1].equals("/") && parsedInput[2].equals("0")) {
                        throw new DivisionByZeroException("Division by zero");
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    public boolean isNumberMatch(String input) {
        return input.matches(numberRegex);
    }

    public boolean isOperationMatch(String input) {
        return input.matches(operationRegex);
    }
}
