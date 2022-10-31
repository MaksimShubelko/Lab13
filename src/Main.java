import java.util.Scanner;

public class Main {
    private static final Validator validator = new Validator();
    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Введите число");
            input = scanner.nextLine();
            try {
                if (validator.validate(input)) {
                    System.out.println(input + " = " + calculator.calculate(input));
                }
            } catch (IncorrectInputTypeException | NumbersTooLongException | DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
