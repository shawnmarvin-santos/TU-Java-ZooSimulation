package zoo.module;

import zoo.model.people.Vendor;
import zoo.model.people.Veterinarian;
import zoo.model.people.Visitor;
import zoo.repository.AdminRepository;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

public class VisitorModule {
    private Visitor visitor;

    public VisitorModule(Visitor visitor){
        this.visitor = visitor;
    }

    public void visitorMainMenu(){
        ConsoleUtil.println(MessageConstants.VISITOR_MAIN_MENU_BANNER);

        boolean inZoo = true;
        while (inZoo) {
            int option = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 4);
            ConsoleUtil.println("");
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

    private void visitEnclosure(){
        ConsoleUtil.println(MessageConstants.VISITOR_VISIT_ENCLOSURE_BANNER);
        int option = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 4);
        ConsoleUtil.println("");
        //get animals

        int feed = InputValidationUtil.promptForOption("Would you like to feed(Yes(1)/No(2): ",2);
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

        ConsoleUtil.println("");
        ConsoleUtil.println("What would you like to do next?");
    }

    //To Improve, but works
    private void visitShop(){
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
        ConsoleUtil.println("What would you like to do next?");
    }

    private void visitHospital(){
        AdminRepository adminRepository = AdminRepository.getInstance();
        Veterinarian vet = adminRepository.getZooStaff().getVeterinarianOnDuty();

        ConsoleUtil.println(MessageConstants.VISITOR_VISIT_HOSPITAL_BANNER);

        int option = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 5);

        switch (option){
            case 1:
                //healthy=false animals in hospital
                break;
            case 2:
                //healthy=true animals in hospital
                break;
            case 3:
                vet.Lecture();
                break;
            case 4:
                vet.Heal();
                break;
            case 5:
                ConsoleUtil.println("Thank you for visiting the hospital!");
                break;
            default:
                break;
        }
    }

    private void leaveZoo(){
        ConsoleUtil.println("Thank you for visiting!");
    }
}
