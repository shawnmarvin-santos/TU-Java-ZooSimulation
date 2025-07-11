package zoo.utils;

import java.util.Scanner;

public class InputValidationUtil {
    public static void validateNonNegative(double value){
        if (value <= 0){
            throw new IllegalArgumentException(MessageConstants.AMOUNT_NEGATIVE_ERROR_MESSAGE);
        }
    }

    public static double promptForDouble(Scanner scanner, String prompt){
        while (true) {
            try{
                ConsoleUtil.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e){
                ConsoleUtil.printError(MessageConstants.INVALID_NUMBER_ERROR_MESSAGE);
            }
        }
    }

    public static int promptForOption(Scanner scanner, String prompt, int maxOption){
        while (true) {
            try{
                ConsoleUtil.print(prompt);
                int option = Integer.parseInt(scanner.nextLine().trim());
                if(option > 0 && option <= maxOption){
                    return option;
                } else {
                    ConsoleUtil.printError(MessageConstants.INVALID_NUMBER_ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                ConsoleUtil.printError(MessageConstants.INVALID_NUMBER_ERROR_MESSAGE);
                ConsoleUtil.print(prompt);
            }
        }
    }

    public static String promptNonEmpty(Scanner scanner, String prompt){
        while (true){
            ConsoleUtil.print(prompt);
            String input = scanner.nextLine();
            if (!input.isEmpty()){
                return input;
            }
            ConsoleUtil.printError(MessageConstants.INPUT_EMPTY_ERROR_MESSAGE);
        }
    }
}
