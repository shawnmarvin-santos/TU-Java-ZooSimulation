package zoo.utils;

public class ConsoleUtil {

    public static void print(String message){
        System.out.print(message);
    }

    public static void println(String message){
        System.out.println(message);
    }

    public static void printError(String errorMessage) {
        System.out.printf(MessageConstants.ERROR_MESSAGE_FORMAT, errorMessage);
    }

    public static void printf(String message, Object ... args){
        System.out.printf(message, args);
    }
}
