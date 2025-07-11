package zoo.utils;

import java.util.Scanner;

public class InputValidationUtil {

    /**
     * Validate non negative doubles
     * @param value value to be validated
     */
    public static void validateNonNegative(double value){
        if (value <= 0){
            throw new IllegalArgumentException(MessageConstants.AMOUNT_NEGATIVE_ERROR_MESSAGE);
        }
    }

    /**
     * Validate non negative integer
     * @param value value to be validated
     */
    public static void validateNonNegative(int value){
        if (value <= 0){
            throw new IllegalArgumentException(MessageConstants.AMOUNT_NEGATIVE_ERROR_MESSAGE);
        }
    }

    /**
     * Validate if input is a Double
     * @param scanner scanner for repeatable input
     * @param prompt message to be printed on the console
     * @return the input
     */
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

    /**
     * Validate if the user inputted a valid option
     * @param scanner scanner for repeatable input
     * @param prompt message to be printed on the console
     * @param maxOption the max option before returning an error
     * @return the input
     */
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

    /**
     * Validate if the user inputted a valid string option and not empty
     * @param scanner scanner for repeatable input
     * @param prompt message to be printed on the console
     * @return the input
     */
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
