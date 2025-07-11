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
    public static final String TICKET_MAIN_MENU_BANNER = """
            === Zoo Ticket Shop ===
            Welcome! Here's what you can expect in the zoo:
            Visit animal enclosures.
            Purchase items in our shop
            Listen to science lectures at the Hospital
            
            """;
    public static final String VISITOR_MAIN_MENU_BANNER = """
            === Visitor ===
            2. Visit Shop
            3. Visit Hospital
            4. Leave Zoo
            """;
    public static final String VISITOR_VISIT_ENCLOSURE_BANNER = """
    ===Zoo Enclosure===
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

    //SUCCESS MESSAGE
    public static final String LOGIN_SUCCESSFUL_MESSAGE = "Login successful. Welcome!\n";
    public static final String STAFF_SETUP_SUCCESSFUL_MESSAGE = "Staff has been successfully setup!\n";

    //WARNING MESSAGE
    public static final String WARNING_MESSAGE_FORMAT = "WARNING: %s \n";
    public static final String ZOO_IS_ALREADY_OPEN_WARNING = "Zoo is already open.";
    public static final String ZOO_IS_NOT_OPEN_WARNING = "Zoo is not open.";
    public static final String ZOO_STAFF_IS_NOT_YET_SET_UP = "Staff has not been setup yet.";

    //ERROR MESSAGES
    public static final String ERROR_MESSAGE_FORMAT = "Error: %s.";
    public static final String AMOUNT_NEGATIVE_ERROR_MESSAGE = "Input must be non-negative.";
    public static final String INPUT_EMPTY_ERROR_MESSAGE = "Input cannot be empty.";
    public static final String INVALID_NUMBER_ERROR_MESSAGE = "Invalid number, please try again.";
    public static final String INVALID_OPTION_ERROR_MESSAGE = "Invalid option.";
    public static final String LOGIN_UNSUCCESSFUL_ERROR_MESSAGE = "Invalid login attempt!";
    public static final String LOGIN_UNSUCCESSFUL_LIMIT_REACHED = "Invalid login attempt limit reached! Please try again later";

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

}
