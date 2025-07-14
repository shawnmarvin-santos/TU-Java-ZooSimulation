package zoo.module;

import zoo.model.people.Visitor;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

import java.util.Random;

public class TicketModule {

    private final Random random = new Random();

    private String ticketCode;

    public void ticketMainMenu() {
        ConsoleUtil.println(MessageConstants.TICKET_MAIN_MENU_BANNER);
        int bought = InputValidationUtil.promptForOption(MessageConstants.BUY_A_TICKET,2);
        ConsoleUtil.println("");

        String name;
        if (bought == 1){
            name = InputValidationUtil.promptForString(MessageConstants.ENTER_YOUR_NAME_PROMPT);
            int age = (int) InputValidationUtil.promptForDouble(MessageConstants.ENTER_YOUR_AGE_PROMPT);
            InputValidationUtil.validateNonNegative(age);

            String type = "";
            double price = 0d;
            if (age >= 60){
                type = "SENIOR";
                price = 50d;
            } else if (age >= 18) {
                type = "ADULT";
                price = 150d;
            } else if (age >= 6) {
                type = "STUDENT";
                price = 75d;
            } else if (age >= 0) {
                type = "CHILD";
                price = 0d;
            }
            String formattedPrice = Double.toString(price);

            ConsoleUtil.println("");
            ConsoleUtil.println("You qualify for a " + type + " ticket.");
            ConsoleUtil.println("Ticket Price: " + formattedPrice);
            ConsoleUtil.println("");
            int purchaseTicket = InputValidationUtil.promptForOption(MessageConstants.PROCEED_WITH_PURCHASE,2);
            ConsoleUtil.println("");

            if (purchaseTicket == 1) {
                ConsoleUtil.println(MessageConstants.TICKET_PURCHASED);
                int code = random.nextInt(8999) + 1000;
                this.ticketCode = "ZOO-"+code;
                ConsoleUtil.println("Your ticket code is: "+this.ticketCode);

                ConsoleUtil.println(MessageConstants.TICKET_ADDED_TO_SYSTEM);
                ConsoleUtil.println("");
                Visitor visitor = createVisitor(name);
                this.visitorEntry(visitor);
            }

        }
    }

    private void visitorEntry(Visitor visitor){
        ConsoleUtil.println(MessageConstants.VISITOR_ENTRY_BANNER);
        while (true) {
            String ticket = InputValidationUtil.promptForString(MessageConstants.ENTER_YOUR_TICKET_CODE_PROMPT);
            if (ticket.equals(this.ticketCode)) {
                accesssVisitorModule(visitor);
                return;
            } else {
                ConsoleUtil.println(MessageConstants.PLEASE_TRY_AGAIN);
            }
        }
    }

    private Visitor createVisitor(String name){
        return new Visitor(name);
    }

    private void accesssVisitorModule(Visitor visitor){
        ConsoleUtil.println(MessageConstants.VISITOR_WELCOME_TO_ZOO_BANNER);
        VisitorModule visitorModule = new VisitorModule(visitor);
        visitorModule.visitorMainMenu();
    }
}
