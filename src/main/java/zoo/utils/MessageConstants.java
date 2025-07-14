package zoo.utils;

public class MessageConstants {
    //GENERAL UI
    public static final String WELCOME_BANNER_MESSAGE = """
            === Welcome to the Zoo Admin Console ===
            Please log in.
            """;
    public static final String ADMIN_MAIN_MENU_BANNER = """
            ========== ZOO ADMIN MAIN MENU ==========
            1. Setup Zoo Staff
            2. Access Handler Module
            3. Open Zoo to Visitors
            4. Close Zoo to Visitors
            5. Exit
            """;
    public static final String ZOO_SETUP_BANNER = "--- Zoo Setup ---";
    public static final String VISITOR_ENTRY_BANNER ="=== Visitor Entry ===";
    public static final String TICKET_MAIN_MENU_BANNER = """
            === Zoo Ticket Shop ===
            Welcome! Here's what you can expect in the zoo:
            Visit animal enclosures.
            Purchase items in our shop
            Listen to science lectures at the Hospital
            
            """;
    public static final String VISITOR_MAIN_MENU_BANNER = """
            === Visitor ===
            1. Visit Enclosure
            2. Visit Shop
            3. Visit Hospital
            4. Leave Zoo
            """;
    public static final String VISITOR_VISIT_ENCLOSURE_BANNER = """
            === Zoo Enclosure ===
            Choose Enclosure:
            1. Pachyderm
            2. Feline
            3. Bird
            """;
    public static final String VISITOR_VISIT_SHOP_BANNER = """
            == Zoo Shop ===
            Available Products:
            1. Soft Drink - 30
            2. Popcorn - 50
            3. Plush toy - 120
            4. Keychain - 45
            """;
    public static final String VISITOR_VISIT_HOSPITAL_BANNER = """
            === Zoo Hospital ===
            1. View Sick Animals
            2. View Healed Animals
            3. Attend Science Lecture
            4. Watch Veterinarian Heal Animals
            5. Exit
            """;
    public static final String VISITOR_WELCOME_TO_ZOO_BANNER = """
            
            === Welcome to the zoo! ===
            
            """;
    public static final String HANDLER_MODULE_BANNER = "--- Welcome Handler %s! ---";
    public static final String ANIMAL_DUTY_MESSAGE = """
            --- Animal Duty Menu --
            Animals assigned to you:
            """;
    public static final String ANIMAL_ACTION_BANNER = """
            Choose Action:
            1. Feed %1$s
            2. Exercise %1$s
            3. Examine %1$s to the vet
            """;
    public static final String SENDING_TO_HOSPITAL_MESSAGE = "Sending to Hospital...";
    public static final String HEALED_ANIMALS_HEADER_MESSAGE = "Healed Animals with timestamp";
    public static final String SICK_ANIMALS_HEADER_MESSAGE = "Sick Animals Currently in Hospital.";
    public static final String HEALED_ANIMAL_LIST_FORMAT = "- %s (%s)\n";
    public static final String SICK_ANIMAL_LIST_FORMAT = "- %s\n";
    public static final String HEALED_ANIMALS_LIST_EMPTY = "No Healed Animals";
    public static final String SICK_ANIMALS_LIST_EMPTY = "No Sick Animals";

    //SUCCESS MESSAGE
    public static final String LOGIN_SUCCESSFUL_MESSAGE = "Login successful. Welcome!\n";
    public static final String STAFF_SETUP_SUCCESSFUL_MESSAGE = "Staff has been successfully setup!\n";
    public static final String ANIMAL_ADMITTED_SUCCESSFUL_MESSAGE = "%s admitted at %s\n\n";
    public static final String ANIMAL_HEALED_SUCCESSFUL_MESSAGE = "Healed: %1$s\n%1$s has been discharged and returned to enclosure.\n\n";

    //WARNING MESSAGE
    public static final String WARNING_MESSAGE_FORMAT = "WARNING: %s \n";
    public static final String ZOO_IS_ALREADY_OPEN_WARNING = "Zoo is already open.";
    public static final String ZOO_IS_NOT_OPEN_WARNING = "Zoo is not open.";
    public static final String ZOO_STAFF_IS_NOT_YET_SET_UP = "Staff has not been setup yet.";

    //ERROR MESSAGES
    public static final String ERROR_MESSAGE_FORMAT = "Error: %s.\n";
    public static final String AMOUNT_NEGATIVE_ERROR_MESSAGE = "Input must be non-negative.";
    public static final String INPUT_EMPTY_ERROR_MESSAGE = "Input cannot be empty.";
    public static final String INVALID_NUMBER_ERROR_MESSAGE = "Invalid number, please try again.";
    public static final String INVALID_OPTION_ERROR_MESSAGE = "Invalid option.";
    public static final String LOGIN_UNSUCCESSFUL_ERROR_MESSAGE = "Invalid login attempt!";
    public static final String LOGIN_UNSUCCESSFUL_LIMIT_REACHED = "Invalid login attempt limit reached! Please try again later";
    public static final String INVALID_HANDLER_NAME_ERROR = "Handler not found.";
    public static final String INVALID_ANIMAL_TYPE = "Invalid Animal Type";
    public static final String FILE_NOT_FOUND = "File not Found!";

    //PROMPTS
    public static final String LOGIN_USERNAME_PROMPT = "Input username: ";
    public static final String LOGIN_PASSWORD_PROMPT = "Input password: ";
    public static final String CHOOSE_OPTION_PROMPT = "Choose an option: ";
    public static final String ENTER_SHOP_PROMPT = "Enter Vendor for Shop: ";
    public static final String ENTER_TICKET_PROMPT = "Enter Vendor for Ticket Shop: ";
    public static final String ENTER_BIRD_HANDLER_PROMPT = "Enter Handler for Bird Enclosure: ";
    public static final String ENTER_FELINE_HANDLER_PROMPT = "Enter Handler for Feline Enclosure: ";
    public static final String ENTER_PACHYDERM_HANDLER_PROMPT = "Enter Handler for Pachyderm Enclosure: ";
    public static final String ENTER_VETERINARIAN_PROMPT = "Enter Veterinarian's name: ";
    public static final String ENTER_MANAGER_PROMPT = "Enter Manager's name: ";
    public static final String ENTER_HANDLER_PROMPT = "Enter Handle's name: ";
    public static final String ENTER_ANIMAL_PROMPT = "Choose animal number to interact with (0 to exit): ";
    public static final String ENTER_YOUR_NAME_PROMPT = "Enter your name: ";
    public static final String ENTER_YOUR_AGE_PROMPT = "Enter your age: ";
    public static final String ENTER_YOUR_TICKET_CODE_PROMPT = "Enter your ticket code: ";
    public static final String BUY_A_TICKET = "Would you like to buy a ticket? (Yes(1)/No(2): ";
    public static final String PROCEED_WITH_PURCHASE = "Proceed with purcase? Yes(1)/No(2): ";

    //GENERIC MESSAGES
    public static final String THANK_YOU_FOR_VISITING_MESSAGE = "Thank you for visiting!";
    public static final String WHAT_WOULD_YOU_LIKE_TO_DO_NEXT_MESSAGE = "What would you like to do next?";
    public static final String PLEASE_TRY_AGAIN = "Please try again";

    //TICKET MODULE MESSAGES
    public static final String TICKET_PURCHASED = "Ticket Purchased";
    public static final String TICKET_ADDED_TO_SYSTEM = "[Ticket added to system]";
}
