package zoo.module;

import zoo.model.building.Building;
import zoo.model.people.Visitor;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;

import java.util.Random;

public class TicketModule {

    private Random random = new Random();

    private ConsoleUtil console = new ConsoleUtil();
    private InputValidationUtil input = new InputValidationUtil();

    private String ticketCode;

    public void ticketMainMenu() {
        console.println("===Zoo Ticket Shop===");
        console.println("Welcome! Here's what you can expect in the zoo:");
        console.println("Visit animal enclosures.");
        console.println("Purchase items in our shop");
        console.println("Listen to science lectures at the Hospital");
        console.println("");
        int bought = input.promptForOption("Would you like to buy a ticket? (Yes(1)/No(2): ",2);
        console.println("");

        String name;
        if (bought == 1){
            name = input.promptForString("Enter your name: ");
            int age = (int) input.promptForDouble("Enter your age: ");
            input.validateNonNegative(age);

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

            console.println("");
            console.println("You qualify for a " + type + " ticket.");
            console.println("Ticket Price: " + formattedPrice);
            console.println("");
            int purchaseTicket = input.promptForOption("Proceed with purcase? Yes(1)/No(2): ",2);
            console.println("");

            if (purchaseTicket == 1) {
                console.println("Ticket purchased!");
                int code = random.nextInt(8999) + 1000;
                this.ticketCode = "ZOO-"+code;
                console.println("Your ticket code is: "+this.ticketCode);

                console.println("[Ticket added to system]");
                console.println("");
                Visitor visitor = createVisitor(name);
                this.visitorEntry(visitor);
            }

        }
    }

    public void visitorEntry(Visitor visitor){
        console.println("===Visitor Entry===");
        String ticket = input.promptForString("Enter your ticket code: ");
        if (ticket.equals(this.ticketCode)){
            console.println("");
            console.println("Welcome to the zoo!");
            console.println("");
            VisitorModule visitorModule = new VisitorModule(visitor);
            visitorModule.visitorMainMenu();
        }
    }

    public Visitor createVisitor(String name){
        return new Visitor(name);
    }
}
