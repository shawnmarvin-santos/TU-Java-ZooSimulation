package zoo.module;

import zoo.model.building.Building;
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
        int bought = InputValidationUtil.promptForOption("Would you like to buy a ticket? (Yes(1)/No(2): ",2);
        ConsoleUtil.println("");

        String name;
        if (bought == 1){
            name = InputValidationUtil.promptForString("Enter your name: ");
            int age = (int) InputValidationUtil.promptForDouble("Enter your age: ");
            InputValidationUtil.validateNonNegative(age);

            String type = "";
            double price = 0d;
            if (age >= 60){
                type = "SENIOR";
                price = 50d;
            } else if (18 <= age && age >= 59) {
                type = "ADULT";
                price = 150d;
            } else if (6 <= age && age >= 17) {
                type = "STUDENT";
                price = 75d;
            } else if (0 <= age && age >= 5) {
                type = "CHILD";
                price = 0d;
            }
            String formattedPrice = Double.toString(price);

            ConsoleUtil.println("");
            ConsoleUtil.println("You qualify for a " + type + " ticket.");
            ConsoleUtil.println("Ticket Price: " + formattedPrice);
            ConsoleUtil.println("");
            int purchaseTicket = InputValidationUtil.promptForOption("Proceed with purcase? Yes(1)/No(2): ",2);
            ConsoleUtil.println("");

            if (purchaseTicket == 1) {
                ConsoleUtil.println("Ticket purchased!");
                int code = random.nextInt(8999) + 1000;
                this.ticketCode = "ZOO-"+code;
                ConsoleUtil.println("Your ticket code is: "+this.ticketCode);

                ConsoleUtil.println("[Ticket added to system]");
                ConsoleUtil.println("");
                Visitor visitor = createVisitor(name);
                this.visitorEntry(visitor);
            }

        }
    }

    private void visitorEntry(Visitor visitor){
        ConsoleUtil.println("=== Visitor Entry ===");
        String ticket = InputValidationUtil.promptForString("Enter your ticket code: ");

        if (ticket.equals(this.ticketCode)){
            accesssVisitorModule(visitor);
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
