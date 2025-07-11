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

        console.println("What would you like to do next?");
    }

    public void visitShop(){

    }

    public void visitHospital(){

    }

    public void leaveZoo(){
        console.println("Thank you for visiting!");
    }
}
