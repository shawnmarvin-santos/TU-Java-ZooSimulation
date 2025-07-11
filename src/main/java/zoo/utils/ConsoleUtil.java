package zoo.utils;

public class ConsoleUtil {

    /**
     * For printing messages inline
     * @param message message to be printed, pass messages from Message Constants
     */
    public static void print(String message){
        System.out.print(message);
    }

    /**
     * For printing messages with new line after
     * @param message message to be printed, pass messages from Message Constants
     */
    public static void println(String message){
        System.out.println(message);
    }

    /**
     * For printing error messages with a format, the format can be changed on Message Constants
     * @param errorMessage formatted message to be printed, pass messages from Message Constants
     */
    public static void printError(String errorMessage) {
        System.out.printf(MessageConstants.ERROR_MESSAGE_FORMAT, errorMessage);
    }

    /**
     * For printing formatted messages with a given argument
     * @param message message to be printed that has a specific format (%s, %d, %.2f)
     * @param args arguments to be used on the message
     */
    public static void printf(String message, Object ... args){
        System.out.printf(message, args);
    }
}
