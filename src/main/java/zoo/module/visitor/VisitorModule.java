package zoo.module.visitor;

import zoo.model.animal.pachyderm.Rhino;
import zoo.model.building.enclosure.PachydermEnclosure;
import zoo.model.people.Visitor;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;

import java.util.Scanner;

public class VisitorModule {

    private ConsoleUtil console = new ConsoleUtil();
    private InputValidationUtil input = new InputValidationUtil();

    private Visitor visitor;

    public VisitorModule(Visitor visitor){
        this.visitor = visitor;
    }

    public void visitorMainMenu(){
        console.println("===Visitor===");
        console.println("2. Visit Shop");
        console.println("3. Visit Hospital");
        console.println("4. Leave Zoo");

        boolean inZoo = true;

        while (inZoo) {
            int option = input.promptForOption("Choose an option: ", 4);
            console.println("");
            switch (option) {
                case 1:
                    visitEnclosure();
                    break;
                case 2:
                    visitShop();
                    break;
                case 3:
                    visitHospital();
                    break;
                case 4:
                    leaveZoo();
                    inZoo = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void visitEnclosure(){
        console.println("===Zoo Enclosure===");
        console.println("Choose Enclosure:");
        console.println("1. Pachyderm");
        console.println("2. Feline");
        console.println("3. Bird");
        int option = input.promptForOption("Choose an option: ", 4);
        console.println("");
        //get animals

        int feed = input.promptForOption("Would you like to feed(Yes(1)/No(2): ",2);
        switch (option){
            case 1:
                //visitor.goTo();
                if (feed == 1){
                    //pachyderm makeSound
                }
                //pachyderm eats;
            case 2:
                //visitor.goTo();
                if (feed == 1){
                    //feline makeSound
                }
                //feline eats;
            case 3:
                //visitor.goTo();
                if (feed == 1){
                    //bird makeSound
                }
                //bird eats;
        }

        console.println("");
        console.println("What would you like to do next?");
    }

    //To Improve, but works
    public void visitShop(){
        console.println("===Zoo Shop===");
        console.println("Available Products:");
        console.println("1. Soft Drink - 30");
        console.println("2. Popcorn - 50");
        console.println("3. Plush toy - 120");
        console.println("4. Keychain - 45");
        int option = input.promptForOption("What would you like to buy: ", 4);

        console.println("Selected:");
        switch (option){
            case 1:
                console.println("Soft Drink (30)");
                break;
            case 2:
                console.println("Popcorn (50)");
                break;
            case 3:
                console.println("Plush toy (120)");
                break;
            case 4:
                console.println("Keychain (45)");
                break;
            default:
                break;
        }

        int checkout = input.promptForOption("Proceed to checkout(Yes(1)/No(2)", 2);
        if (checkout == 1){
            console.println("Payment Successful!");
            //receipt here pag may time to improve
        }

        console.println("");
        console.println("What would you like to do next?");
    }

    public void visitHospital(){
        console.println("===Zoo Hospital===");
        console.println("1. View Sick Animals");
        console.println("2. View Healed Animals");
        console.println("3. Attend Science Lecture");
        console.println("4. Watch Veterinarian Heal Animals");
        console.println("5. Exit");
        int option = input.promptForOption("Choose an option: ", 5);

        console.println("Selected:");
        switch (option){
            case 1:
                //healthy=false animals in hospital
                break;
            case 2:
                //healthy=true animals in hospital
                break;
            case 3:
                //get doctor name
                console.println("Dr. " + "" +" Begins lecture...");
                break;
            case 4:
                //get doctor name
                console.println("Dr. " + "" +" Begins healing sick animals...");
                break;
            case 5:
                console.println("Thank you for visiting the hospital!");
                break;
            default:
                break;
        }
    }

    public void leaveZoo(){
        console.println("Thank you for visiting!");
    }
}
