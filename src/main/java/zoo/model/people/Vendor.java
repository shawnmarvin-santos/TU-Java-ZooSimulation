package zoo.model.people;

import zoo.model.building.Building;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

public class Vendor extends People{
    public Vendor(String name, Building location) {
        this.name = name;
        this.location = location;
    }

    public void Sell(){
        ConsoleUtil.println(MessageConstants.VISITOR_VISIT_SHOP_BANNER);

        int option = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 4);

        ConsoleUtil.println("Selected:");
        switch (option){
            case 1:
                ConsoleUtil.println("Soft Drink (30)");
                break;
            case 2:
                ConsoleUtil.println("Popcorn (50)");
                break;
            case 3:
                ConsoleUtil.println("Plush toy (120)");
                break;
            case 4:
                ConsoleUtil.println("Keychain (45)");
                break;
            default:
                break;
        }

        int checkout = InputValidationUtil.promptForOption("Proceed to checkout(Yes(1)/No(2): ", 2);
        if (checkout == 1){
            ConsoleUtil.println("Payment Successful!");
            //receipt here pag may time to improve
        }

        ConsoleUtil.println("");
    }
}
